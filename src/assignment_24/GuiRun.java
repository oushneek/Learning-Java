package assignment_24;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class GuiRun {

    public static void main(String[] args) {

        GuiSave form = new GuiSave();
        form.design();
        form.setTitle("Entry Form");
        form.setVisible(true);
        form.setLayout(new GridLayout(10, 10, 10, 10));
        form.setSize(400, 300);
        form.setLocation(300, 200);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
