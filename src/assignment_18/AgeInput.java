package assignment_18;

import javax.swing.JOptionPane;

public class AgeInput {

    public static void main(String[] args) {

        AgeCalculate people = new AgeCalculate();
        people.name = JOptionPane.showInputDialog("Name : ");
        people.age = JOptionPane.showInputDialog("Age : ");
        people.calculate();

    }
}
