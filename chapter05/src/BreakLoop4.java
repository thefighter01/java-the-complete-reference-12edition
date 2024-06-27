public class BreakLoop4 {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 3; ++i){
        System.out.println("pass " + i);
        for (int k = 0; k < 100; ++k){
            if (k == 10) break outer;
            System.out.println(" " + k);
        }
        System.out.println("this will not be printed");
        }
        System.out.println("Loop complete");
    }
}
