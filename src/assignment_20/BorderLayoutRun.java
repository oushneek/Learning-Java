package assignment_20;

import javax.swing.*;

public class BorderLayoutRun {

    public static void main(String[] args) {

        FrameDesign frame = new FrameDesign();
        frame.design();
        frame.setTitle("Border Layout Example");
        frame.setVisible(true);
        frame.setLocation(500, 200);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
