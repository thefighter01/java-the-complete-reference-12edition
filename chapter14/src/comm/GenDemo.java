package comm;

public class GenDemo {
    public static void main(String []args){
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);
        var var = new Gen<Double>(9.0);

        iOb.showType();

        int v = iOb.getOb();

        System.out.println("value is "+ v);


        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value is "+ s);
    }
}
