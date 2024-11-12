package version6;

public class Gen2 extends Gen<String > {
    public Gen2(String o) {
        super(o);
    }

    String getOb(){
        System.out.println("You called String getOb()");
        return ob;
    }
}
