public class B extends A {
    int k , total;
    int i;
    void showK(){
        System.out.println("the value of k is: " + k);
    }
    void sum(){
        System.out.println("i + j + k : " + (i+j+k));
    }

    B(int a , int b){
        super.i = a;
        i = b;
    }
    B(){

    }

    void show(){
        System.out.println("the value of i in subclass is " + i);
        System.out.println("the value of k in superclass is " + super.i);
    }

}
