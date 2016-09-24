package assignment_17;

import javax.swing.JFrame;

public class FirstGuiMain {

    public static void main(String[] args) {

        FirstGuiForm form = new FirstGuiForm();
        form.design();
        form.setTitle("Give Information");
        form.setVisible(true);
        form.setLocation(500, 200);
        form.setSize(300, 400);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
