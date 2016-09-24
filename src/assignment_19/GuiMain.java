package assignment_19;

import javax.swing.JFrame;

public class GuiMain {

    public static void main(String[] args) {

        GuiForm form = new GuiForm();
        form.setVisible(true);
        form.setLocation(500, 200);
        form.setSize(400, 200);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
