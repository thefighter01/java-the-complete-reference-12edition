package version3;

public class Caller implements Runnable {
    Thread t;
    String msg;
    CallMe target ;

    public Caller(CallMe target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        System.out.println("Caller created " + t.getName());
    }


    public void run(){

        synchronized (target) {
            target.call(msg);
        }
    }
}
