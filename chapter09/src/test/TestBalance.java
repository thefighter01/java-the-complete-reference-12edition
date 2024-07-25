package test;

import mypack.*;
public class TestBalance {
    public static void main(String[] args) {
        Balance tst = new Balance("J. j. Jaspers" , 99.88);
        tst.show();

        System.out.println(MyIF.getDefaultNumber());
    }
}
