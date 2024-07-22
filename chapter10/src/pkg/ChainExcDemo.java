package pkg;

public class ChainExcDemo {
    static void demoproc(){

        NullPointerException e = new NullPointerException("top layer");

        e.initCause( new ArithmeticException() );
        throw e;
    }
    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("Caught "+e);

            // display cause exception
            System.out.println("Original Cause  "+e.getCause());
        }
    }
}
