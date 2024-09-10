public class NewThreadE extends Thread {
    NewThreadE() {
        super("Demo Thread");
        System.out.println("Child Thread " + this);
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Child Thread " + n);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Existing Child Thread " );
    }
}
