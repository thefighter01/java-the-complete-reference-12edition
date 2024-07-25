package Interfaces;

public class IFStack3 {
    public static void main(String[] args) {
        IntStack st1;

        DynStack st2 = new DynStack(5);

        FixedStack st3 = new FixedStack(8);

        st1 = st2;

        for (int i = 0; i < 12; ++i) st1.push(i);

        st1 = st3;
        for (int i = 0; i <8 ; ++i) st1.push(i);

        st1 = st2;

        System.out.println("values in dynstack");
        for (int i = 0; i < 12 ; ++i) System.out.print(st1.pop() + " ");
        System.out.println();
        System.out.println("values in fixed stack");

        st1 = st3;
        for (int i = 0; i < 8 ; ++i) System.out.print(st1.pop() + " ");
    }
}
