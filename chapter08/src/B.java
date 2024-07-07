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
        System.out.println("B constructor");
    }

    void showIs(){
        System.out.println("the value of i in subclass is " + i);
        System.out.println("the value of k in superclass is " + super.i);
    }
    B(int a , int b , int c){
        super(a , b);
        this.k = c;
    }
    void show(){
        super.show();
        System.out.println("the value of k is: " + k);
    }
    // this overload
    void show(String msg){
        System.out.println(msg + k);
    }

}
