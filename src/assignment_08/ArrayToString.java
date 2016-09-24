package assignment_08;

public class ArrayToString {

    public static void main(String[] args) {

        char[] array = {'S', 'U', 'S', 'T'};
        System.out.println("Array = ");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        String str = new String(array);
        System.out.println("String = " + str);

    }
}
