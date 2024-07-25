package Interfaces;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth(){
        System.out.println("Calsses that implement interfaces may also define their own methods, too");
    }
}
