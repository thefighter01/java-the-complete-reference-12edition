package comm;

public class MultiThreadDemo {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("one");
        NewThread nt2 = new NewThread("two");
        NewThread nt3 = new NewThread("three");
         nt1.t.start();
         nt2.t.start();
         nt3.t.start();

         try {
             Thread.sleep(10000);
         }catch (InterruptedException e){
             System.out.println("Main Thread Interrupted");
         }

         System.out.println("Main Thread Exit");

         //the main thread is important for 2 reasons
        // it's the thread from which all threads will be spawned
        // it must be the last thread to finish execution because it performs various shutdown actions

    }
}
