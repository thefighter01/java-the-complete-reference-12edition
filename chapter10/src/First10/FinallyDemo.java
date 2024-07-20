package First10;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("procA finally");
        }
    }
    static void procB(){
        try {
            System.out.println("inside B");
            return;
        }finally {
            System.out.println("procB finally");
        }
    }
    static void procC(){
        try {
            System.out.println("inside C");
        }

        finally {
            System.out.println("procC finally");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (RuntimeException e){
            System.out.println(e);
        }
        finally {
            System.out.println("mainA finally");
        }
        procB();
        procC();
    }
}
