package gui;

import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {
    private JPanel panelMainR;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JLabel labelName;
    private JTextField fieldName;
    private JLabel labelAge;
    private JSpinner spinnerAge;
    private JLabel labelUser;
    private JTextField fieldUser;
    private JLabel labelMail;
    private JTextField fieldMail;
    private JLabel labelPassword;
    private JPasswordField fieldPassword;
    private JLabel labelPasswordConfirm;
    private JPasswordField fieldPasswordConfirm;
    private JLabel labelRegister;
    private JPanel paneTitle;

    public Register(){
        super("Registro");
        setContentPane(panelMainR);
    }
}
