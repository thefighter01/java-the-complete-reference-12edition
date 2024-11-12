package version5;

public class Gen <T>{
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        System.out.println("Gen's get Ob()");
        return ob;
    }
}
