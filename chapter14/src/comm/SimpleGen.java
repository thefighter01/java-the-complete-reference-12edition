package comm;

public class SimpleGen {
    public static void main(String []args){
        TwoGen<Integer , String> tgObj = new TwoGen<Integer , String> (88 , "Generics");

        tgObj.showType();

        int v = tgObj.getOb1();

        System.out.println("Integer value is " + v);

        String str = tgObj.getOb2();
        System.out.println("String value is " + str);

    }
}
