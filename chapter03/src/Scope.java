package src;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10){
            int y = 20;

            System.out.println("x and y " +x + "  " + y );
            x = 2 * y;
        }
        // when i do y = 100 error y is not known here

        System.out.println("x is " +x);
    }
}
