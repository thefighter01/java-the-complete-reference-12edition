public class BoxDemo2 {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        // assign values to box1's instance variables
        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        // assign different values to box2

        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        double vol = box1.depth * box2.width *box1.height;
        System.out.println("vol = " + vol);
        vol = box2.depth * box2.height *box2.width;
        System.out.println("vol = " + vol);

    }
}
