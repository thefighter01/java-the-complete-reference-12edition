// unsigned shifting a byte value

public class ByteUShit {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);
        System.out.println("the value of b is " + b + " "+Integer.toBinaryString(b)+ "    "+ 0xff + "  "+Integer.toBinaryString(0xff));
        // c // 1111 1111 1111 1111 -> byte is 1111 = 15
        // d // 0000 1111 1111 1111 -> byte is 1111 = 15
        // 11 11 11 11
        // b & 0xff is 1111 >> 4 is 0
        System.out.println("the value of b is " + b + " " + "c "+ c + " " + "d  "+ d + " " + "e "+ e);



    }
}
