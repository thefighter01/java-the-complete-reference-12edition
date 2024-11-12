package version5;

public class Gen2 <T> extends Gen<T>{
    public Gen2(T o){
        super(o);
    }

    T getOb(){
        System.out.println("Gen2's get ob()");
        return ob;
    }
}
