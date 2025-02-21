package comm;

public class MyClass <T extends Comparable<T>> implements MinMax<T>{

    T [] vals;

    MyClass(T [] o){
        vals = o;
    }

    @Override
    public T getMin() {
       T v = vals[0];
       for (int i = 1; i < vals.length; i++) {
           if (vals[i].compareTo(v) < 0){
               v = vals[i];
           }
       }
       return v;
    }

    @Override
    public T getMax() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0){
                v = vals[i];
            }
        }
        return v;
    }
}
