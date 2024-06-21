package src;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Conversion of int into bye .");
        b = (byte) i; // b will have a value equal to the remainder of dividing i by the 2^(8);
        System.out.println("i and b " + i + " " + b);
        System.out.println("Conversion of double into int ."); // will delete the numbers after percision and divide the real number by 2^(32)
        i = (int)d;
        System.out.println("i and d " + i + " " + d);
        System.out.println("Conversion of double into byte .");
        b = (byte) d;
        System.out.println("b and d " + b + " " + d);
    }
}
