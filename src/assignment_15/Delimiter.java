package assignment_15;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Delimiter {

    public static void main(String[] args) {

        String a = "This is$an apple.@I# like# apple very much.";
        System.out.println("The main string is '" + a + "'");
        StringTokenizer b = new StringTokenizer(a);
        int x;

        System.out.println(" (a) NO DELIMIETER");
        for (x = b.countTokens(); x > 0; x--) {
            System.out.print(b.nextToken());
        }

        StringTokenizer c = new StringTokenizer(a, " ");
        System.out.println("\n (b) SPACE");
        for (x = c.countTokens(); x > 0; x--) {
            System.out.print(c.nextToken());
        }

        StringTokenizer d = new StringTokenizer(a, ".");
        System.out.println("\n (c) DOT");
        for (x = d.countTokens(); x > 0; x--) {
            System.out.print("  x= " + x + "  ");
            System.out.print(d.nextToken());
        }

        StringTokenizer e = new StringTokenizer(a, " .");
        System.out.println("\n (d) SPACE DOT");
        for (x = e.countTokens(); x > 0; x--) {
            //System.out.print("  x= "+x+"  ");
            System.out.print(e.nextToken());
        }

        StringTokenizer f = new StringTokenizer(a, "#$");
        System.out.println("\n (e) SYMBOL");
        for (x = f.countTokens(); x > 0; x--) {
            System.out.print(f.nextToken());
        }

        StringTokenizer g = new StringTokenizer(a, "sp");
        System.out.println("\n (f) CHARACTER");
        for (x = g.countTokens(); x > 0; x--) {
            System.out.print(g.nextToken());
        }

        String s = "apple";
        StringTokenizer h = new StringTokenizer(a, s);
//    System.out.println("\n () SUBSTRING");
//    for(x=h.countTokens();x>0;x--)
//    {
//        System.out.print(h.nextToken());
//    }

    //  (j) Specific Token Print  
        System.out.println("\n\n (j) Specific Token Print\nNumber of the Token : ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String tokenizer;
        System.out.print("Tokenizer = ");
        Scanner sc2 = new Scanner(System.in);
        tokenizer = sc2.nextLine();
        StringTokenizer tkn = new StringTokenizer(a, tokenizer);
        x = 1;
        for (tkn.hasMoreTokens(); x <= t; x++) {
            //System.out.println(x);
            if (x == t) {
                System.out.println(tkn.nextToken());
            } else {
                tkn.nextToken();
            }
        }

    }
}
