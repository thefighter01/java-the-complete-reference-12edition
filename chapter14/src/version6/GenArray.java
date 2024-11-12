package version6;

public class GenArray <T extends Number> {

    T ob;

    T [] vals;

    GenArray(T o , T [] nums){
        ob = o;
        this.vals = nums;

    }

    public GenArray(){
        ob = null;
        vals = null;
    }

    T getOb(){
        return ob;
    }
}
