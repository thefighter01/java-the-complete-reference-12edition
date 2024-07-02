public class AccessTest {
    public static void main(String[] args) {
        TestAccessModifiers ob = new TestAccessModifiers();

        ob.a = 10;
        ob.b = 20;

        // ob.c it will give me error

        ob.setC(100);
        System.out.println("a , b , c " + ob.a + " "+ ob.b + " "+ob.getC()) ;
    }
}
