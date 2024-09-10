package comm;

public class Producer implements Runnable {
    Thread t;
    Q q;
    public Producer(Q q) {
        this.q = q;
        t = new Thread(this , "Producer");
    }

    public void run(){
        int i = 0;
        while (true)
            q.put(i++);
    }
}
