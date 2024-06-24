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

        System.out.println(0xf1);

        System.out.println("              b = 0x"
                + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println("         b >> 4 = 0x"
                + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println("        b >>> 4 = 0x"
                + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & 0xff) >> 4 = 0x"
                + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);

        /*
        1 ) -15 okay
        1111 this is 15 so negative 15 is 1111 1111 1111 1111 1111 1111 1111 0001
        -15 >> 4 is 1111 1111 1111 1111 1111 1111 1111 1111 okay
        b >> 4 & 0x0f is 1111 and the other is one
        so the answer is f1




        2) c = 1111 1111 1111 1111 1111 1111 1111  1111
        the first is f and the second is f
        0xff


        3) d=  0000 1111 1111 1111  1111 1111 1111 1111
        d >> 4 is 0000 0000 1111 1111 1111 1111 1111 1111
        the first is f and the second is f also


        4) b & 0xff
        1111 1111 1111 1111 1111 1111 1111 111 &  1111 1111
        is 1111 11111  >> 4 0000 1111
        e = 1111
        the first is 0 and the second is f
         */



        byte [] my = {(byte) 0xf1 , (byte) 0xff , (byte) 0x0f , (byte) 0xf1 >> 4 , (byte) (0xf1 >>> 4) , (byte) (0xff >> 4)} ;
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i] + "     "+Integer.toBinaryString(my[i]));
        }
        System.out.println("##################################");
        int [] me = { 0xf1 , 0xff , 0x0f ,  0xf1 >> 4 ,  (0xf1 >>> 4) , (0xff >> 4)} ;
        for (int i = 0; i < my.length; i++) {
            System.out.println(me[i] + "     "+Integer.toBinaryString(me[i]));
        }

        byte cur = (byte) 257;
        System.out.println(cur);




    }
}
