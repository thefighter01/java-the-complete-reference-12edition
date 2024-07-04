public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);

        System.out.println("value of i in mc is " + mc.getI());

        mc.setI(19);

        System.out.println("value of i in mc is " + mc.getI());
    }
}
