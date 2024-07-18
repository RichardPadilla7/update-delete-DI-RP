import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;


public class EstudiantesA {
    public JPanel study;
    public JTextArea titulo;
    public JTextArea indicacion;
    public JTextField ingresarCedula;
    public JButton btnBorrar;
    public JButton btnActualizar;
    public JLabel imprimirDatos;

    public EstudiantesA() {
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String urls = "jdbc:mysql://localhost:3306/estudiantes2024A";
                String user = "root";
                String password = "123456";

                try (Connection connection = DriverManager.getConnection(urls, user, password)) {
                    System.out.println("Conectado a la base de datos");
                    String query = "select * from estudiante";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }

                JFrame frame = new JFrame("Mi aplicación");
                frame.setContentPane(new ACTUALIZARB1B2().update2);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(9000, 9000);
                frame.pack();
                frame.setVisible(true);

            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String URL = "jdbc:mysql://localhost:3306/estudiantes2024A";
                String USER = "root";
                String PASSWORD = "123456";

                String cedula = "1726195207";

                String sql = "DELETE FROM estudiante WHERE cedula = ?";

                try (
                        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                        PreparedStatement statement = conn.prepareStatement(sql)
                ) {
                    statement.setString(1, cedula);

                    int filasEliminadas = statement.executeUpdate();

                    if (filasEliminadas > 0) {
                        System.out.println("El estudiante " + cedula + " ha sido eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún estudiante con cedula " + cedula + " para eliminar.");
                    }
                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
            }
        });
    }
}
