public class VarArgs {
    static void vaTest(int ... v){
        System.out.println("the number of args is " + v.length+ " contents");

        for (var x : v){
            System.out.println(x+ " ");
        }
        System.out.println("\n" + "...........");
    }
    public static void main(String[] args) {

        vaTest(10);
        vaTest(1,2,3);
        vaTest();

    }
}
