package pkg;

public class Exc2 {
    public static void main(String[] args) {
        int d , a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("this line will not be printed");
        }catch (Exception e){
            System.out.println("division by zero");
        }
        System.out.println("after the statement");
    }
}
