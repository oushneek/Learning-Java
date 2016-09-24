package assignment_02;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScanPrint {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Input : ");
        JOptionPane.showMessageDialog(null, input);

        System.out.println("Input : ");
        Scanner input2 = new Scanner(System.in);
        String output = input2.nextLine();
        System.out.println(output);

    }
}
