public class MultByTwo {
    public static void main(String[] args) {
        int cur = 0xFFFFFFE;
        for (int i = 0; i < 5; ++i){
            System.out.println(cur+ "  "+Integer.toBinaryString(cur));
            cur<<=1;
        }
    }
}

//1111111111111111111111111110000
//11111111111111111111111111100000 the high order bit refer to the sign of the number