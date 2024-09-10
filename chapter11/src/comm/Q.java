package comm;

public class Q {
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while(!valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("InterruptedException caught");
            }
        }
        valueSet = false;
        System.out.println("get called " + n);
        notify();
        return n;
    }

    synchronized void put(int n){
        while(valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("InterruptedException caught");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("put called " + n);
        notify();
    }
}
