public class TypeInfereneInFor {
    public static void main(String[] args) {
        // use type inference with the loop control variable
        for (var x = 2.5; x < 100.0; x *=2){
            System.out.println(x);
        }
        System.out.println();

        // use type inference with the iteration variable
        int [] num = {1 , 2,3 ,4 , 5};
        for (var v : num){
            System.out.println(v);
        }
        System.out.println();
    }
}
