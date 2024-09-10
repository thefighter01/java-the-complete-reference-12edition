public class AutoBox4 {
    public static void main(String []args){
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb after experssion " + dOb);

        switch (iOb){
            case 1: System.out.println("iOb is one ");
            break;
            case 2: System.out.println("iOb is two ");
            break;
            default: System.out.println("iOb is not one or two ");
            System.out.println("Here the End of Switch");

        }
    }
}
