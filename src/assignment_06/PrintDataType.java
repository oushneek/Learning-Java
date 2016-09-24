package assignment_06;

public class PrintDataType {

    public static void main(String[] args) {

        boolean b = true;   // true & false  
        char c = 'T';       // character only
        byte byt = -128;    //  -128 >> 127
        short s = 12345;    // -2^16 >> 2^16-1
        int i = 2130000000; // -2^32 >> 2^32-1
        long l = 123456789; // -2^64 >> 2^64-1
        float f = 31.3f;
        double d = 123.45;
        System.out.println("Boolean = " + b);
        System.out.println("Char = " + c);
        System.out.println("Byte = " + byt);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
    }
}
