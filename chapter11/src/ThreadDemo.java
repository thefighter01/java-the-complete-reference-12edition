public class ThreadDemo {
    public static void main(String[] args) {

        NewThread nt = new NewThread();
        nt.t.start(); // the t thread inside this object will call the run method on this object

        try {
            for (int n = 5; n > 0; --n){
                System.out.println("Main thread : " + n);
                Thread.sleep(1000); // ensure that the main thread will be the last thread to finish
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread existing");
    }
}
