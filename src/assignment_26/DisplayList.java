package assignment_26;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisplayList extends JFrame {

    static final String DB_URL = "jdbc:mysql://localhost/test_java_db";
    static final String DB_USER = "root";
    static final String DB_PASS = "";

    private JLabel names;
    private JComboBox nameBox;
    private JLabel print;
    //private String []infoArray = new String[20];
    private String[] nameArray = new String[20];
    private String[] deptArray = new String[20];
    private String[] sexArray = new String[20];
    private String[] addressArray = new String[20];
    private String[] phoneArray = new String[20];
    private int infoIndex;
    private JTextArea printInfo;
    private String st;

    public void display() {

        Connection conn = null;
        Statement stmt = null;
        int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * from StudentInfo";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                nameArray[i] = rs.getString("name");
                deptArray[i] = rs.getString("dept");
                sexArray[i] = rs.getString("sex");
                addressArray[i] = rs.getString("address");
                phoneArray[i] = rs.getString("phone");
                i++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DisplayList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DisplayList.class.getName()).log(Level.SEVERE, null, ex);
        }

        setTitle("Display List...");
        setVisible(rootPaneCheckingEnabled);
        setLayout(new GridLayout(10, 10, 10, 10));
        setSize(700, 500);
        setLocation(400, 200);

        names = new JLabel("Names");
        nameBox = new JComboBox(nameArray);
        print = new JLabel("Information :");
        add(names);
        add(nameBox);
        add(print);

        HandlerClass handler = new HandlerClass();
        nameBox.addActionListener(handler);

        printInfo = new JTextArea();
        printInfo.setEditable(false);
        add(printInfo);

    }

    private class HandlerClass implements ActionListener {

        //private ItemListener ItemSelectable;
        @Override
        public void actionPerformed(ActionEvent e) {

            infoIndex = nameBox.getSelectedIndex();

            st = String.format("Name : " + nameArray[infoIndex] + ",Department : " + deptArray[infoIndex] + ",Sex : " + sexArray[infoIndex] + ",Address : " + addressArray[infoIndex] + ",Phones : " + phoneArray[infoIndex] + ".");
            printInfo.setText(st);
        }
    }

}
