public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;
        ob.test();
        ob.test(10 , 20);

        ob.test(i);

        ob.test(123.2);
    }
}
