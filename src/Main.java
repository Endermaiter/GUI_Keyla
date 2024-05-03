

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new Gui();
            frame.setSize(1200, 570);
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }
}