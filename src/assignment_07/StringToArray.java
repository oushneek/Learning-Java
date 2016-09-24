package assignment_07;

public class StringToArray {

    public static void main(String[] args) {

        String str = "Shahjalal";
        System.out.println("String = " + str);
        char[] arr = str.toCharArray();
        int len = str.length();
        int i;
        for (i = 0; i < len; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);

        }
    }
}
