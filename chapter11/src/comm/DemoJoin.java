package comm;

public class DemoJoin {
    public static void main(String [] args){
        NewThread nt1 = new NewThread("one");
        NewThread nt2 = new NewThread("two");
        NewThread nt3 = new NewThread("three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is Alive " + nt1.t.isAlive());
        System.out.println("Thread Two is Alive " + nt2.t.isAlive());
        System.out.println("Thread Three is Alive " + nt3.t.isAlive());


        try {
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Thread One is Alive " + nt1.t.isAlive());
        System.out.println("Thread Two is Alive " + nt2.t.isAlive());
        System.out.println("Thread Three is Alive " + nt3.t.isAlive());
    }
}
