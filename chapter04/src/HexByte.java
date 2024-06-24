public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;

        System.out.println(b + " "+ Integer.toBinaryString(b));
        // b >> 4 & b1 --> 1111 which is 15
        byte b1 = (byte) 0xf;
        System.out.println(b1 + " "+ Integer.toBinaryString(b1));
        // b & b1 is 1
        System.out.println("b = 0x"+hex[(b>> 4) & b1] + hex[b & 0x0f]);
        // 0xf1


    }
}
