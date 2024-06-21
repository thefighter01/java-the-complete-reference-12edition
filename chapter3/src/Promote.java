package src;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);
        // the result of f * b is float
        // the result of i / c is int
        // the result of d * s double
        // so the final answer is double type
        System.out.println("result is  " + result);
    }
}
