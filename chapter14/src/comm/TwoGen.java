package comm;

public class TwoGen <T , V>{
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1(){
        return ob1;
    }

    V getOb2(){
        return ob2;
    }

    void showType(){
        System.out.println("the type of the first object is "+ ob1.getClass().getName() + "\n" + "the type of the 2nd class is "+ ob2.getClass().getName());
    }
}
