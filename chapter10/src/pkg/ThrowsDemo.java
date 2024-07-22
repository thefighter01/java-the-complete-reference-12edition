package pkg;


public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside ThrowOne");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e) {
            System.out.println("Inside NullPointerException " + e.getMessage());
        }

    }
}
