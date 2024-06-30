public class BoxDemo6 {
    public static void main(String[] args) {
        BoxC box1 = new BoxC();
        BoxC box2 = new BoxC();

        double vol;
        vol = box1.volume();
        System.out.println(vol);
        vol = box2.volume();
        System.out.println(vol);
    }
}
