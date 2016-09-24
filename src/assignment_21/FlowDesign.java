package assignment_21;

import java.awt.*;
import javax.swing.*;

public class FlowDesign extends JFrame {

    private JLabel name;
    private JLabel pass;
    private JTextField nametxt;
    private JPasswordField passfield;
    private JButton button;

    public void design() {

        setLayout(new FlowLayout());

        name = new JLabel("Name");
        nametxt = new JTextField(20);
        pass = new JLabel("Password");
        passfield = new JPasswordField(10);
        button = new JButton("Log in");

        add(name);
        add(nametxt);
        add(pass);
        add(passfield);
        add(button);
    }

}
