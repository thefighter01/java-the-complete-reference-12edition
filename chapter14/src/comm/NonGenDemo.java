package comm;

public class NonGenDemo {
    public static void main(String []args){
        NonGen iOb;

        iOb= new NonGen(88);

        iOb.showType();

        int v= (Integer) iOb.getOb();

        System.out.println("value is "+ v+ "\n");

        NonGen strOb = new NonGen("Non-Generics-Test");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("value is "+ str + "\n");

        iOb = strOb; // although this is valid syntax but because they are 2 refrences from type Ojbect

        v = (Integer) iOb.getOb(); // this will cause runtine error

    }
}
