public class UseStatic {
    static int a = 3;
    static int b ;
    static void meth(int x){
        System.out.println("x " + x);
        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    UseStatic(){
        System.out.println("Constructor");
    }

    static {
        System.out.println("static block");
        b = 4 * a;
    }
    public static void main(String[] args) {
        UseStatic obj = new UseStatic();
        obj.meth(42);

    }
}
