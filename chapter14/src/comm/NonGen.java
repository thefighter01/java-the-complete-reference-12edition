package comm;

public class NonGen {
    Object ob;

    NonGen(Object ob){
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("the of the class is "+ ob.getClass().getName() );
    }
}
