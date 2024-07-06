public class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        System.out.println("the Content of class A ");
        superOb.showIJ();

        System.out.println();
        System.out.println("the Content of class B ");

        subOb.i = 7 ;
        subOb.j = 8;
        subOb.k = 9;
        subOb.showIJ();
        subOb.showK();
        System.out.println();

        System.out.println("the of i and j and k is  ");
        subOb.sum();


        // we can not access private members in super class


    }
}
