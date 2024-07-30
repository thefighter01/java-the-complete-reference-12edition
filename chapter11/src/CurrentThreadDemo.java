public class CurrentThreadDemo {
    
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current Thread is" + t);

        t.setName("My Thread");
        System.out.println("Thread After change " + t);


        Thread cur = Thread.currentThread();

        //System.out.println(cur.equals(t));

        try{
            for (int n = 5 ; n > 0; --n){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
