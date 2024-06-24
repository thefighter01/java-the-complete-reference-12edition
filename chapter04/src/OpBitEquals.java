public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a|=4; // 0001 | 0100 --> 0101 which is 5
        b>>=1; // 0010 -->> 0001 which is 1
        c<<=1; // 0011 --> 0110 which is 6
        a^=c; // 0101 ^ 0110 = 0011 which is 3
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);


    }
}
