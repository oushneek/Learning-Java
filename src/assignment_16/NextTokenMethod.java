package assignment_16;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NextTokenMethod {

    public static void main(String[] args) {

        System.out.println("Enter the String : ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println("Enter the Tokenizer : ");
        Scanner input2 = new Scanner(System.in);
        String t = input2.nextLine();
        StringTokenizer b = new StringTokenizer(a, t);

        boolean i;
        for (i = true; i = b.hasMoreTokens();) {
            System.out.println("Next Token = " + b.nextToken());
        }

    }
}
