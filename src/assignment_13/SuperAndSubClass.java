package assignment_13;

public class SuperAndSubClass {

    static class One {

        void print() {
            System.out.println("This is subclass 'One'.");
        }
    }

    static class Two {

        void print() {
            System.out.println("This is subclass 'Two'.");
        }
    }

    public static void main(String[] args) {

        System.out.println("This is the 'Superclass'.");
        One a = new One();
        Two b = new Two();
        a.print();
        b.print();

    }
}
