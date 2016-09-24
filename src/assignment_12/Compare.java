package assignment_12;

public class Compare {

    public static void main(String[] args) {

        	//a declared string comparing to an undeclared string
        String s1 = "Shahjalal";
        if (s1.equals("Shahjalal")) {
            System.out.println("Proved equal by the 1st way");
        }

        int s = s1.compareTo("Shahjalal");
        if (s > 0) {
            System.out.println("+ve");
        } else if (s < 0) {
            System.out.println("-ve");
        } else {
            System.out.println("=");
        }

                      //for another declared string
        System.out.println("for another declared string");
        String s2 = "Shah";
        if (s1.equals(s2)) {
            System.out.println("Proved equal by the 1st way");
        }

        int s3 = s1.compareTo(s2);
        if (s3 > 0) {
            System.out.println("+ve ");
        } else if (s3 < 0) {
            System.out.println("-ve ");
        } else {
            System.out.println("= ");
        }

    }
}
