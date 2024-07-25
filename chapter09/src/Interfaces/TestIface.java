package Interfaces;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        // c can't access the members of the client class
    }
}
