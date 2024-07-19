import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi aplicación");
        frame.setContentPane(new EstudiantesA().study);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(9000, 9000);
        frame.pack();
        frame.setVisible(true);

    }
}