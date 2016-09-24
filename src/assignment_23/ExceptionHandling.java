package assignment_23;

import java.util.Scanner;

class FirstException extends Exception {
}

class SecondException extends Exception {
}

public class ExceptionHandling {

    public static void main(String[] args) {

        System.out.println("a = ");
        Scanner in1 = new Scanner(System.in);
        int num1 = Integer.parseInt(in1.nextLine());
        System.out.println("b = ");
        Scanner in2 = new Scanner(System.in);
        int num2 = Integer.parseInt(in2.nextLine());
        double c;
        try {
            if (num2 == 0) {
                throw new FirstException();
            } else if (num1 < 0 || num2 < 0) {
                throw new SecondException();
            }
            c = Math.sqrt(num1 / num2);
            System.out.println("Square root of (a/b) =  " + c);

        } catch (FirstException e) {
            System.out.println("Can not be divided by 0.");

        } catch (SecondException f) {
            System.out.println("Square root of negative number is not real.");

        }

    }
}
