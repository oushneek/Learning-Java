package assignment_11;

public class Format {

    public static void main(String[] args) {

        int i = 5;
        float fl = 1.1f;
        System.out.println("The value of float is " + fl + ",while the value of integer is  " + i);
        String fs;
        fs = String.format("The value of float is " + fl + ",while the value of integer is  " + i);
        System.out.println("fs  :");
        System.out.println(fs);
    }
}
