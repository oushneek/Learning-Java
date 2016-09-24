package assignment_19;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class GuiForm extends JFrame {

    private JLabel namelabel;
    private JTextField nametext;
    private JLabel agelabel;
    private JTextField agetext;
    private JButton button;
    private String username;
    private String group;
    private String age;

    public GuiForm() {

        super.setTitle("Give Info");
        setLayout(new FlowLayout());
        namelabel = new JLabel("Name : ");
        agelabel = new JLabel("Age(1-30) : ");
        nametext = new JTextField("", 20);
        agetext = new JTextField("", 2);
        button = new JButton("Save");

        add(namelabel);
        add(nametext);
        add(agelabel);
        add(agetext);
        add(button);

        Handler obj = new Handler();
        nametext.addActionListener(obj);
        agetext.addActionListener(obj);
        button.addActionListener(obj);

    }

    public class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                username = nametext.getText();
                age = agetext.getText();
                int ageconvert = Integer.parseInt(age);
                if (ageconvert >= 1 && ageconvert <= 10) {
                    group = "New Born";
                } else if (ageconvert >= 11 && ageconvert < 20) {
                    group = "Teen";
                } else if (ageconvert == 20) {
                    group = "Both Teen and Young";
                } else {
                    group = "Young";
                }
                String print = String.format("Hello %s \nYour group is " + "%s", username, group);
                JOptionPane.showMessageDialog(null, print);
            }
        }
    }
}
