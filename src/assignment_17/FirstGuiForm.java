package assignment_17;

import java.awt.*;
import javax.swing.*;

public class FirstGuiForm extends JFrame {

    private JLabel name;
    private JTextField nametxt;
    private JLabel password;
    private JPasswordField passtxt;
    private JLabel sex;
    private JComboBox box;
    private JLabel merital;
    private JRadioButton single;
    private JRadioButton married;
    private ButtonGroup group;
    private JLabel address;
    private JTextArea addArea;
    private JLabel hobby;
    private JCheckBox read;
    private JCheckBox swim;
    private JCheckBox cook;
    private JButton save;
    private JButton clear;

    public void design() {

        setLayout(new FlowLayout());
        String[] s = {"Male", "Female"};

        name = new JLabel("");
        name.setText("name");
        nametxt = new JTextField(20);
        password = new JLabel("Password");
        passtxt = new JPasswordField(10);
        sex = new JLabel("Sex");
        box = new JComboBox(s);
        merital = new JLabel("Meritaal Status");
        single = new JRadioButton("Single");
        married = new JRadioButton("Married");
        group = new ButtonGroup();
        address = new JLabel("Address");
        addArea = new JTextArea(5, 5);
        hobby = new JLabel("Hobby");
        read = new JCheckBox("Reading");
        swim = new JCheckBox("Swimming");
        cook = new JCheckBox("Cooking");
        save = new JButton("Save");
        clear = new JButton("Clear");

        add(name);
        add(nametxt);
        add(password);
        add(passtxt);
        add(sex);
        add(box);
        add(merital);
        add(single);
        add(married);
        group.add(single);
        group.add(married);
        add(address);
        add(addArea);
        add(hobby);
        add(read);
        add(swim);
        add(cook);
        add(save);
        add(clear);
    }

}
