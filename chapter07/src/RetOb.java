public class RetOb {
    public static void main(String[] args) {
        TestReturnObj ob1 = new TestReturnObj(2);
        TestReturnObj ob2;

        ob2 = ob1.incByTen();
       // System.out.println(ob2 + "       " + ob1);
        System.out.println("a in ob1  "+ ob1.a);
        System.out.println("a in ob2  "+ ob2.a);

        ob2 = ob2.incByTen();
        System.out.println("a in ob2  "+ ob2.a);
    }
}
