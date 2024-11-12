package version5;

public class OverRideDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88); // we can do this with all versions begining from jdk7

        Gen2<Integer>iOb2 = new Gen2<Integer>(99);

        Gen2<String> strOb2 = new Gen2<String>("Generics Test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());

        var cur = (Gen<Integer>)iOb2;
        System.out.println(cur.getOb());
    }
}
