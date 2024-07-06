public class BoxDemoWeight {
    public static void main(String[] args) {

        BoxWeight box1 = new BoxWeight(10 , 20 , 15 , 34.3);
        BoxWeight box2 = new BoxWeight(2 , 3, 4 , 0.076);

        double vol;

        vol = box1.volume();
        System.out.println("vol of box1 is " + vol);
        System.out.println("the weight of box1 is " + box1.weight);
        System.out.println();

        vol = box2.volume();
        System.out.println("vol of box2 is " + vol);
        System.out.println("the weight of box2 is " + box2.weight);
    }
}
