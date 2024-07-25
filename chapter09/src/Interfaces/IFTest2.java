package Interfaces;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack st1 = new DynStack(5);
        DynStack st2 = new DynStack(8);

        for (int i = 0; i < 12; ++i) st1.push(i);
        for (int i = 0; i < 18; ++i) st2.push(i);

        System.out.println("stack in stack1 ");
        for (int i = 0; i < 12; ++i) System.out.println(st1.pop());

        System.out.println("stack in stack2 ");

        for (int i = 0; i < 18; ++i) System.out.println(st2.pop());
    }
}
