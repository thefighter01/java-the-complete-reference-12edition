package Interfaces;

public class IFTest {
    public static void main(String[] args) {
        FixedStack st1 = new FixedStack(5);
        FixedStack st2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) st1.push(i);
        for (int i = 0; i < 8; i++) st2.push(i);

        System.out.println("stack in mystack1");
        for (int i = 0; i <5; ++i) System.out.println(st1.pop());
        System.out.println("stack in mystack2");
        for (int i = 0; i <8; ++i) System.out.println(st2.pop());
    }
}
