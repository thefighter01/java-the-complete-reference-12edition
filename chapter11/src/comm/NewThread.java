package comm;

class NewThread implements Runnable {
    String threadName ;
    Thread t;
    public NewThread(String threadName) {
        this.threadName = threadName;
        t = new Thread(this, threadName);
        System.out.println("New thread " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; --i){
                System.out.println(threadName + "  thread " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(threadName + " Thread Interrupted");
        }
        System.out.println(threadName + " Thread Exit");
    }
}
