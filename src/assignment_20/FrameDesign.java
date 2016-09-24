package assignment_20;

import java.awt.*;
import javax.swing.*;

public class FrameDesign extends JFrame {

    private JLabel north;
    private JButton entry;
    private JButton display;
    private JButton other;
    private JLabel south;

    public void design() {
        setLayout(new BorderLayout());

        north = new JLabel("This is NORTH.");
        entry = new JButton("Entry");
        display = new JButton("Display");
        other = new JButton("Others");
        south = new JLabel("This is SOUTH.");

        add(BorderLayout.NORTH, north);
        add(BorderLayout.WEST, entry);
        add(BorderLayout.CENTER, display);
        add(BorderLayout.EAST, other);
        add(BorderLayout.SOUTH, south);

    }

}
