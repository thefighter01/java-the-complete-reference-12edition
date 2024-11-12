package version3;

public class HierDemo {
    public static void main(String[] args) {

        Gen2<String , Integer> x = new Gen2<String , Integer>("value is " ,99);

        System.out.print(x.getOb());

        System.out.println(x.getOb2());

        float m = 2.5f;

        Double d = Double.valueOf(m);

        //int y = (Integer)d;
    }
}
