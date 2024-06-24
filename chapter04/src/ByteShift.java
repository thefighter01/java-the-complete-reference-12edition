public class ByteShift {
    public static void main(String[] args) {

        // java promotes short ,char , byte into int in any mathimatical operation , when using shift left the bits shifted lift will not be lost until they shift past bit position 31
        // furthermore a negative byte or short will be sign-extended when it is promoted to int , thus the high order bits will be filled with 1's
        // for these reasons to perform a left shit on a byte or short implies that you must discard the high-order bytes of the result
        // when the value promoted to int and then shifted , you must discard the top 3 bytes of the result if you want to put the result into byte

        byte a = 64 , b;
        int i ;
        i = a << 2; // byte is promoted to int when we using any mathimatical operation
        b = (byte) (i << 2);
        System.out.println("theValueOf a is " + a + " and b is " + b+ " and i is " + i);

    }
}
