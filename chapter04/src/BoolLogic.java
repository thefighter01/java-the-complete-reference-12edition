public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b; //true;
        boolean d = a & b; // false
        boolean e = a ^ b; // true;
        boolean f = (!a & b) | (a & !b); // false | true = true;
        boolean g = !a;
        System.out.println("theValueOf a is " + a);
        System.out.println("theValueOf b is " + b);
        System.out.println("theValueOf c is " + c);
        System.out.println("theValueOf d is " + d);
        System.out.println("theValueOf e is " + e);
        System.out.println("theValueOf f is " + f);
        System.out.println("theValueOf g is " + g);
    }
}
