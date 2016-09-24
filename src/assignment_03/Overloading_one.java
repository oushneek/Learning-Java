package assignment_03;

class Print {

    public void printType(int i) {
        System.out.println(i + " is an integer.");
    }

    public void printType(String s) {
        System.out.println("'" + s + "' is a string.");
    }

    public void printType(int i, String s) {
        System.out.println(i + " is an integer and '" + s + "' is a string.");
    }
}

public class Overloading_one {

    public static void main(String[] args) {

        Print A = new Print();
        Print B = new Print();
        Print C = new Print();

        A.printType(10);
        B.printType("School");
        C.printType(20, "Rice");
    }
}
