package assignment_26;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntryForm extends JFrame {

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

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/test_java_db";

    static final String USER = "root";
    static final String PASS = "";

    public void design() {
        super.setTitle("Entry Form");
        setVisible(true);
        setLayout(new GridLayout(10, 10, 10, 10));
        setSize(400, 300);
        setLocation(300, 200);

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

        nametxt.addActionListener(handler);
        deptname.addActionListener(handler);
        bmale.addActionListener(handler);
        bfemale.addActionListener(handler);
        addresstxt.addActionListener(handler);
        save.addActionListener(handler);
        clear.addActionListener(handler);
        teletalk.addActionListener(handler);
        citycell.addActionListener(handler);
        gp.addActionListener(handler);

    }

    private class HandlerClass implements ActionListener {

        private ItemListener ItemSelectable;
        String phones = " ";

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == save) {

                String name;
                String dept;
                String data;
                String sex;
                String address;
                name = nametxt.getText();
                dept = deptlist[deptname.getSelectedIndex()];
                if (bmale.isSelected()) {
                    sex = "Male";
                } else {
                    sex = "Female";
                }
                address = addresstxt.getText();
                if (teletalk.isSelected()) {
                    phones += "Teletalk ";
                }
                if (citycell.isSelected()) {
                    phones += "Citycell ";
                }
                if (gp.isSelected()) {
                    phones += "GP ";
                }

                Connection conn = null;
                Statement stmt = null;

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    stmt = conn.createStatement();
                    String sql = "INSERT INTO StudentInfo  VALUES ('" + name + "','" + dept + "','" + sex + "','" + address + "','" + phones + "')";
                    stmt.executeUpdate(sql);

                } catch (SQLException ex) {
                    Logger.getLogger(EntryForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EntryForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (e.getSource() == clear) {
                System.out.println("clear");
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
