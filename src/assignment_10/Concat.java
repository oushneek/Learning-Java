package assignment_10;

public class Concat {

    public static void main(String[] args) {

        String s1 = "Shahjalal";
        String s2 = " University";
        String s3 = " of Science and Technology";

        String add = s1.concat(s2);
        System.out.println(add);

        String result = s1.concat(s2).concat(s3);
        System.out.println(result);

    }
}
