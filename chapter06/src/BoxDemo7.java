public class BoxDemo7 {
    public static void main(String[] args) {
        BoxC box1 = new BoxC(10 , 20 , 15);

        BoxC box2 = new BoxC(3 , 6 , 9);

        double volume;

        volume = box1.volume();
        System.out.println(volume);
        volume = box2.volume();




    }
}
