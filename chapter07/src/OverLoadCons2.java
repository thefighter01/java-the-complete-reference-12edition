public class OverLoadCons2 {
    public static void main(String[] args) {
        Box box1 = new Box(10 , 20  , 15);
        Box box2 = new Box();

        Box box3 = new Box(7);

        Box clone = new Box(box1);
        double volume = box1.volume();
        System.out.println(volume);

        volume = box2.volume();
        System.out.println(volume);
        volume = box3.volume();
        System.out.println(volume);

        volume = clone.volume();
        System.out.println(volume);


    }
}
