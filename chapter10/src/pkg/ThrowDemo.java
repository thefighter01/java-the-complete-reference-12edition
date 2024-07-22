package pkg;

public class ThrowDemo {
    static void demoporc(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside demoproc "+ e);
            throw e;
        }
    }
    public static void main(String[] args) {
        try{
            demoporc();
        }catch (NullPointerException e){
            System.out.println("ReCaught "+ e);
        }
    }
}
