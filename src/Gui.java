import javax.swing.*;

public class Gui extends JFrame {
    private JButton buttonResponse;
    private JTextArea textArea1;
    private JButton buttonClear;
    private JPanel panel;

    public Gui(){
        super("Prueba Keyla");
        setContentPane(panel);
        buttonResponse.addActionListener(e -> textArea1.setText("Si, mucho"));
        buttonClear.addActionListener(e -> textArea1.setText(""));
    }

}
