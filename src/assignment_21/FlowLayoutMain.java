package assignment_21;

import javax.swing.*;

public class FlowLayoutMain {

    public static void main(String[] args) {

        FlowDesign frame = new FlowDesign();
        frame.design();
        frame.setTitle("Flow Layout Example");
        frame.setVisible(true);
        frame.setLocation(500, 200);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
