package src;

public class JustTest {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c; // java promotes (short , char , byte ) to int when we have an expression
        // if i tried to put (a * b) / c into byte it will give me compile-time-error cause we can not convert int into byte in implicit way
        // we must do it explicit

        //byte d = (a * b) / c;
        System.out.println(d);

        long x = 100;
        float y = 10;
        //long z = y * x;
        float cur = x * y;
        System.out.println(cur);
    }
}
