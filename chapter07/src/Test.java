public class Test {
    int a , b;
    Test(int a , int b){
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test o){
        if (o.a == this.a && o.b == this.b) return true;
        return false;
    }

    void meth(int i , int j){
        i*=2;
        j/=2;
    }

     Test() {}

    void meth(Test o){
        o.a*=2;
        o.b/=2;
    }


}
