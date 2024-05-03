

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Gui();
                frame.setSize(600, 800);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
    }
}