public class BitLogic {
    private static String decimalToBinary(int num) {
        StringBuilder cur = new StringBuilder();
       for (int i = 0; i < 4; ++i){
           if ((num & 1) > 0){
               cur.append("1");
           }
           else cur.append("0");
           num >>= 1;

       }
        return cur.reverse().toString();
    }
    public static void main(String[] args) {
        String [] binary = new String[16];
        for (int i = 0; i < 16; ++i){
           binary[i] = decimalToBinary(i);
        }
        int a = 3; // 0011
        int b = 6;// 0110
        int c = a | b; // 0111
        int d = a & b; // 0010
        int e = a ^ b;//0101
        int f = (~a & b) | (a & -b); // 0100 | 0010 --> (0110)
        int g = -a & 0x0f; //1101
        // -a  (1101)
        // ~a (1100)
        //-b (1010)
        // 15 1111


        int who = 0x0f;
        System.out.println("The Value of who is " + who);
        System.out.println("The Value of a is " + binary[a]);
        System.out.println("The Value of b is " + binary[b]);
        System.out.println("The Value of c is " + binary[c]);
        System.out.println("The Value of d is " + binary[d]);
        System.out.println("The Value of e is " + binary[e]);
        System.out.println("The Value of f is " + binary[f]);
        System.out.println("The Value of g is " + binary[g]);


    }
}
