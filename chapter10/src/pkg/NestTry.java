package pkg;

public class NestTry {
    public static void main(String[] args) {

        try {
            int a = args.length;
            int b = 42 / a;

            try{
                if (a == 1) a = a / (a -a);

                if (a == 2){
                    int [] c= {1};
                    c [49] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("lol " + e);
            }
        }catch (ArithmeticException e){
            System.out.println("division by zero " + e);
        }
    }
}
