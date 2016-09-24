package assignment_09;

public class StringCut {

    public static void main(String[] args) {

        char[] arr = {'O', 'U', 'S', 'H', 'N', 'E', 'E', 'K'};
        System.out.println(arr);
        String x = new String(arr, 2, 3);
        System.out.println("Cut String = " + x);

    }
}
