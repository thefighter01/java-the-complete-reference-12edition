public class TestReturnObj {
    int a;

    TestReturnObj(int i){
        a = i;
    }

    TestReturnObj incByTen(){
        return new TestReturnObj(10+a);
    }
}
