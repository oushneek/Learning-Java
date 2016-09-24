package assignment_26;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainForm {

    public static void main(String[] args) {

        MainForm student = new MainForm();
        student.form();
    }
    private JButton entry;
    private JButton display;
    private JButton close;

    public void form() {
        JFrame frame = new JFrame("Main Form");
        frame.setVisible(true);
        frame.setSize(200, 200);
        frame.setLocation(200, 200);
        frame.setLayout(new GridLayout(3, 1, 10, 10));

        entry = new JButton("Entry Form");
        display = new JButton("Display List");
        close = new JButton("Close");

        frame.add(entry);
        frame.add(display);
        frame.add(close);

        HandlerClass handler = new HandlerClass();
        entry.addActionListener(handler);
        display.addActionListener(handler);
        close.addActionListener(handler);
    }

    private class HandlerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == entry) {
                EntryForm form = new EntryForm();
                form.design();
            } else if (e.getSource() == display) {
                DisplayList list = new DisplayList();
                list.display();
            } else if (e.getSource() == close) {
                System.exit(0);
            }
        }
    }

}
