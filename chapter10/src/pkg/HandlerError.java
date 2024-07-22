package pkg;

import java.util.Random;

public class HandlerError {
    public static void main(String[] args) {
        int a, b, c;
        a = b= c = 0;
        Random r = new Random();
        for (int i = 0; i < 32000; i++) {

            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            }catch (Exception e) {
                System.out.println("Divsion by zero");
                System.out.println(e);
                a = 0;
            }
            System.out.println(a);
        }
    }
}
