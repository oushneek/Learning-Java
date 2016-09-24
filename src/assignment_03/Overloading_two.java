package assignment_03;

class Compare {

    String s1;
    String s2;

    public void compare() {
        System.out.println("No string.");
    }

    public void compare(String str1) {
        s1 = str1;
        System.out.println("Only one String is given.");
    }

    public void compare(String str1, String str2) {
        s1 = str1;
        s2 = str2;
        if (s1.equals(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

}

public class Overloading_two {

    public static void main(String[] args) {

        Compare a = new Compare();
        Compare b = new Compare();
        Compare c = new Compare();
        a.compare();
        b.compare("School");
        c.compare("school", "SchOol");

    }
}
