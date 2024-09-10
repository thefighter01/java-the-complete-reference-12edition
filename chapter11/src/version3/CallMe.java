package version3;

public class CallMe {
     void call(String msg){
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
        System.out.println(" ]");
    }

}
