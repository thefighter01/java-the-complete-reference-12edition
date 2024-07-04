public class VarArg3 {

    // overloading with variable length argument

    static void vaTest(int ...v){
        System.out.println("the number of args is " + v.length);

        for (var x: v){
            System.out.println(x + "  ");
        }
        System.out.println();
        System.out.println();
    }

    static void vaTest(boolean ...v){
        System.out.println("the number of args is " + v.length);

        for (var x: v){
            System.out.println(x + "  ");
        }
        System.out.println();
        System.out.println();
    }

    static void vaTest(String msg , int ...v){
        System.out.println("the number of args is " + v.length + "and msg is " + msg);

        for (var x: v){
            System.out.println(x + "  ");
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(1 , 2 , 3);

        vaTest("Testing " , 10 , 20);

        vaTest(true , false , false);
    }
}
