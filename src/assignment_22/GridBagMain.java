package assignment_22;

import java.awt.*;
import javax.swing.*;

class GuiDesign extends JFrame {

    private GridBagLayout lay;
    private GridBagConstraints gbc;

    private JLabel banner;
    private JLabel name;
    private JTextArea nameArea;
    private JLabel id;
    private JTextField idField;
    private JLabel password;
    private JPasswordField passField;
    private JButton save;
    private JButton cancel;

    public GuiDesign() {

        lay = new GridBagLayout();
        setLayout(lay);

        gbc = new GridBagConstraints();

        banner = new JLabel("BANNER");
        banner.setForeground(Color.magenta);
        name = new JLabel("Name");
        nameArea = new JTextArea("Type name");
        id = new JLabel("ID");
        idField = new JTextField(10);
        password = new JLabel("Password");
        passField = new JPasswordField(10);
        save = new JButton("Save");
        cancel = new JButton("Cancel");

        gbc.fill = GridBagConstraints.VERTICAL;
        addComponent(banner, 0, 1, 1, 1);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        addComponent(name, 1, 0, 1, 1);

        gbc.fill = GridBagConstraints.BOTH;
        addComponent(nameArea, 1, 2, 4, 1);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        addComponent(id, 2, 0, 1, 1);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        addComponent(idField, 2, 2, 4, 1);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        addComponent(password, 3, 0, 1, 1);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        addComponent(passField, 3, 2, 4, 1);

        gbc.fill = GridBagConstraints.NONE;
        addComponent(save, 5, 1, 1, 1);

        gbc.fill = GridBagConstraints.NONE;
        addComponent(cancel, 5, 5, 1, 1);
    }

    private void addComponent(Component component, int row, int column, int width, int height) {
        gbc.gridx = column;
        gbc.gridy = row;
        //System.out.println("colm= "+gbc.gridx+" row= "+gbc.gridy);
        gbc.gridwidth = width;
        gbc.gridheight = height;
        lay.setConstraints(component, gbc);
        add(component);
    }

}

public class GridBagMain {

    public static void main(String[] args) {

        GuiDesign frame = new GuiDesign();
        frame.setTitle("GridBag Layout");
        frame.setVisible(true);
        frame.setSize(280, 180);
        frame.setLocation(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
