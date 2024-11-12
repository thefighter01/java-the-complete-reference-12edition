package version2;

public class RawDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        Gen<String> strOb = new Gen<>("Hello");

        Gen raw = new Gen(22d); // this raw type gen object

        double d = (double) raw.getOb();

        System.out.println("value of d is " + d);

       // int i = (Integer) raw.getOb(); // this will give us error because it expects the returned value to be int and it's double , it wil give us runtime erro
       // System.out.println("value of i is " + i);

        strOb = raw; // it can be done at compile time
      //  String cur = strOb.getOb(); // run time error
      //  System.out.println("value of str is " + cur);
        System.out.println( "Some shit " + strOb.ob.getClass());

        raw = iOb;
       // d = (double) raw.getOb(); // run time error
        System.out.println( "Some shit " + raw.ob.getClass());



    }
}
