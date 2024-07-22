package pkg;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a is " + a);
            int b = 42 / a;
            int [] c = {1};
            c [42] = 99;
        }catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
        System.out.println("After try/catch block");
    }
}
