package version3;

public class Q {
    int n;
    synchronized int get(){
        System.out.println("get called " + n);
        return n;
    }

    synchronized void put(int n){
        this.n = n;
        System.out.println("put called " + n);
    }
}
