package comm;

public class GenCons {
    private double val;
    <T extends Number> GenCons(T arg){
        this.val = arg.doubleValue();
    }

    void showVal(){
        System.out.println("val is " + val);
    }
}
