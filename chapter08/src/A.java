public class A {
    int i , j;
    void showIJ(){
        System.out.println("i and j are " + i + "  " + j);
    }

    void setij (int x , int y){
        i = x;
        j = y;
    }

    A(){
        System.out.println("the constructor of A");
    }

    void show(){
        System.out.println("i and j are " + i + "  " + j);
    }
    A(int x , int y){
        i = x;
        j = y;
    }

}
