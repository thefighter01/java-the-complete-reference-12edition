public class OverLoadCons {
    public static void main(String[] args) {
        Box box1 = new Box(10 , 20 , 15);

        Box box2 = new Box();

        Box myCube = new Box(7);

        double vol ;

        vol = box1.volume();

        System.out.println("Volume of box1: " + vol);

        vol = box2.volume();
        System.out.println("Volume of box2: " + vol);
        vol = myCube.volume();

        System.out.println("Volume of myCube: " + vol);



    }
}
