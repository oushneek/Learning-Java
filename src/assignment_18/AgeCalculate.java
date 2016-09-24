package assignment_18;

import javax.swing.JOptionPane;

public class AgeCalculate {

    String name;
    String age;

    public void calculate() {
        int ageInt = Integer.parseInt(age);
        String group = null;
        if (ageInt >= 1 && ageInt <= 10) {
            group = "New Born";
        } else if (ageInt >= 11 && ageInt <= 20) {
            group = "Teen";
        } else if (ageInt >= 21 && ageInt <= 30) {
            group = "Young";
        }

        String print = String.format("Hello %s \nYour group is %s", name, group);
        JOptionPane.showMessageDialog(null, print);
    }
}
