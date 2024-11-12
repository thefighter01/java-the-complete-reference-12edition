package comm;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(10);
        GenCons test2 = new GenCons(103.02F);


        float x = 2.3f;
        double y = 2.5;
//        int n = x;
//        int nn = y;

        test.showVal();

        test2.showVal();
    }
}
