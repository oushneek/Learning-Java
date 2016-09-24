package assignment_24;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.*;

public class GuiSave extends JFrame {

    private JLabel name;
    private JLabel dept;
    private JLabel sex;
    private JLabel address;
    private JLabel mobile;

    private JTextField nametxt;
    private JComboBox deptname;
    private JRadioButton bmale;
    private JRadioButton bfemale;
    private ButtonGroup radio;
    private JTextField addresstxt;
    private JCheckBox teletalk;
    private JCheckBox citycell;
    private JCheckBox gp;
    private JButton save;
    private JButton clear;

    private String[] deptlist = {"CSE", "ENG", "ECO"};

    public void design() {

        name = new JLabel("Name");
        nametxt = new JTextField(20);
        dept = new JLabel("Dept");
        deptname = new JComboBox(deptlist);
        sex = new JLabel("Sex");
        bmale = new JRadioButton("Male");
        bfemale = new JRadioButton("Female");
        radio = new ButtonGroup();
        address = new JLabel("Address");
        addresstxt = new JTextField(40);
        mobile = new JLabel("Mobile");
        teletalk = new JCheckBox("Teletalk");
        citycell = new JCheckBox("Citycell");
        gp = new JCheckBox("GP");
        save = new JButton("SAVE");
        clear = new JButton("CLEAR");

        add(name);
        add(nametxt);
        add(dept);
        add(deptname);
        add(sex);
        add(bmale);
        add(bfemale);
        radio.add(bmale);
        radio.add(bfemale);
        add(address);
        add(addresstxt);
        add(mobile);
        add(teletalk);
        add(citycell);
        add(gp);
        add(save);
        add(clear);

        HandlerClass handler = new HandlerClass();

        save.addActionListener(handler);
        clear.addActionListener(handler);
        nametxt.addActionListener(handler);
        deptname.addActionListener(handler);
        bmale.addActionListener(handler);
        bfemale.addActionListener(handler);
        addresstxt.addActionListener(handler);
        teletalk.addActionListener(handler);
        citycell.addActionListener(handler);
        gp.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener {
       //private ItemListener ItemSelectable;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == save) {
                String name;
                String dept;
                String data;
                String sex;
                String address;
                String phones = "";
                name = nametxt.getText();
                dept = deptlist[deptname.getSelectedIndex()];
                if (bmale.isSelected()) {
                    sex = "Male";
                } else {
                    sex = "Female";
                }
                address = addresstxt.getText();
                if (teletalk.isSelected()) {
                    phones += "Teletalk";
                }
                if (citycell.isSelected()) {
                    phones += "Citycell";
                }
                if (gp.isSelected()) {
                    phones += "GP";
                }
                data = String.format("%s" + "$" + "%s" + "$" + "%s" + "$" + "%s" + "$" + "%s" + "#", name, dept, sex, address, phones);

                File afile = new File("E:/OUSHNEEK  text/Courses/CSE-234/Code/2010331027/File/assignment_24.txt");
                try {
                    FileWriter fw = new FileWriter(afile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(data);
                    bw.flush();
                    bw.close();
                    fw.close();
                } catch (IOException Ex) {
                    System.out.println("Exception");

                }

            }
            if (e.getSource() == clear) {
                nametxt.setText(null);
                deptname.setSelectedIndex(0);
                radio.clearSelection();
                addresstxt.setText(null);
                teletalk.setSelected(false);
                citycell.setSelected(false);
                gp.setSelected(false);
            }
        }
    }
}
