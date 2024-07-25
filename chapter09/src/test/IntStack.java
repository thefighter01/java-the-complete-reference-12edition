package test;

public interface IntStack {
    void push(int value);
    int pop();

    default void clear(){
        System.out.println("clear() not implemented");
    }

    default int [] popNElement(int n){
        return getElements(n);
    }

    default int [] skipAndPopNElement(int skip , int n){
        getElements(skip);

        return getElements(n);
    }
    private int [] getElements(int n){
        var elements = new int[n];
        for (int i = 0; i < n; i++){
            elements[i] = pop();
        }
        return elements;
    }

}
