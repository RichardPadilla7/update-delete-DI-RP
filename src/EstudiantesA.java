import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
