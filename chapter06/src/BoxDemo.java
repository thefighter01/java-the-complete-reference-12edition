class Box{
    double width;
    double height;
    double depth;
}


public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        double volume ;

        box.width = 10;
        box.height = 20;
        box.depth = 15;

        volume = box.width * box.height * box.depth;
        System.out.println("Volume is " + volume);
    }

}
