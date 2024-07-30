
enum Apple{
    Jonathan , GoldenDel , RedDel , Winesap, Cortland
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;

        System.out.println("value of ap is "+ ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if (ap == Apple.GoldenDel)
            System.out.println("apple contains GoldenDel. \n");

        switch (ap) {
            case Jonathan:
                System.out.println("apple is Jonathan. \n");
                break;
            case GoldenDel:
                System.out.println("apple is GoldenDel. \n");
                break;
            case RedDel:
                System.out.println("apple is RedDel. \n");
                break;
            case Winesap:
                System.out.println("apple is Winesap. \n");
                break;
            case Cortland:
                System.out.println("apple is Cortland. \n");
                break;
        }
    }
}
