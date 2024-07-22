package test;

public class PrivateConstructor {
    private static int x = 0;

    private PrivateConstructor() {
        x++;
    }

    public static PrivateConstructor getObj(){
        return new PrivateConstructor();
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        PrivateConstructor.x = x;
    }
}
