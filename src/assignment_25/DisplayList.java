package assignment_25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import javax.swing.*;
import java.util.StringTokenizer;

public class DisplayList extends JFrame {

    private JLabel names;
    private JComboBox nameBox;
    private JLabel print;
    private String[] infoArray = new String[20];
    private String[] nameArray = new String[20];
    private String[] deptArray = new String[20];
    private String[] sexArray = new String[20];
    private String[] addressArray = new String[20];
    private String[] phoneArray = new String[20];
    private int infoIndex;
    private JTextArea printInfo;
    private String st;

    int j = 0, k = 0;
    int i, m;

    public void display() {
        File aFile = new File("E:/Courses/Passed/CSE-234/Code/2010331027/File/assignment_25.txt");
        FileReader fr;
        String allfile = null;

        try {
            fr = new FileReader(aFile);
            BufferedReader br = new BufferedReader(fr);
            allfile = br.readLine();
            System.out.println(allfile);
            fr.close();
            br.close();
        } catch (IOException Ex) {
            System.out.println("Exception");
        }
        //System.out.println("allfil= "+allfile);
        StringTokenizer x = new StringTokenizer(allfile, "#");

        for (i = x.countTokens(); i > 0; i--) {
            //System.out.println("String " + i+ " "+x.nextToken());
            infoArray[j] = x.nextToken();
//            System.out.println("infoArray "+i+ "= "+infoArray[j]);
            StringTokenizer y = new StringTokenizer(infoArray[j], "$");
            //System.out.println(y.nextToken());

            nameArray[j] = y.nextToken();
            deptArray[j] = y.nextToken();
            sexArray[j] = y.nextToken();
            addressArray[j] = y.nextToken();
            phoneArray[j++] = y.nextToken();

        }

        setTitle("Display List...");
        setVisible(true);
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

        private ItemListener ItemSelectable;

        @Override
        public void actionPerformed(ActionEvent e) {

            infoIndex = nameBox.getSelectedIndex();
            st = String.format("Name : " + nameArray[infoIndex] + ",Department : " + deptArray[infoIndex] + ",Sex : " + sexArray[infoIndex] + ",Address : " + addressArray[infoIndex] + ",Phones : " + phoneArray[infoIndex] + ".");
            printInfo.setText(st);
        }

    }
}
