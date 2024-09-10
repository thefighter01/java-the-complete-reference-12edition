public class NewThread implements Runnable {
    Thread t ;

    NewThread(){
        t = new Thread(this , "DemoThread");
        System.out.println("Child Thread " + t);
    }

    public void run(){
        try {
            for (int n = 5 ; n > 0 ; --n){
                System.out.println("Child Thread " + n);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Thread Interrupted" );
        }

        System.out.println("Exiting Child Thread ");
    }
}
