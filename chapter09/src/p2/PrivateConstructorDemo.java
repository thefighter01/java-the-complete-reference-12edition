package p2;

public class PrivateConstructorDemo {
    public static void main(String[] args) {
        var obj = test.PrivateConstructor.getObj();

        System.out.println(obj.getX());
        var obj2 = test.PrivateConstructor.getObj();
        System.out.println(obj2.getX());
    }
}
