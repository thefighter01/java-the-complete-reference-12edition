package pkg;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10 , b = 0;

        int [] vals = {1 ,2 , 3};

        try{
          //  int result = a / b;

            vals[10] = 19;

        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("exception Caught  " +e);
            // e now is a final variable
        }
        System.out.println("After MultiCatch!");
    }
}
