public class VarArgs2 {
    static void vaTEst(String msg , int ... v){
        System.out.println("msg  is " + msg + "      contents  "+v.length);
        for (var x : v){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        vaTEst("One Arg", 1);
        vaTEst("Three varargs", 1, 2, 3);
        vaTEst("No World");
    }
}
