public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i <3; ++i){
            System.out.println("pass  " + i + "#################");
            for (int k = 0; k < 100; ++k){
                if (k == 10) break;
                System.out.println(k+" ");
            }
            System.out.println();
        }
    }
}
