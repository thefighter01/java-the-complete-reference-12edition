public class BreakErr {
    public static void main(String[] args) {
        one : for (int i = 0; i < 3; ++i){
            System.out.println("pass "+i);
        }
//        for (int i = 0; i < 100; ++i){
//            if (i == 10) break one; // wrong will give me error
//            System.out.println("i is "+ i);
//        }
    }
}
