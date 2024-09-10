public class ExtendThread {
    public static void main(String[] args) {
        NewThreadE nt = new NewThreadE();
        nt.start();

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main Thread " + n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main Thread end");
    }
}
