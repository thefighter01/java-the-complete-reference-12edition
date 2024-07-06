public class DemoSuper {
    public static void main(String[] args) {

        BoxWeight box1 = new BoxWeight(10 , 20 , 15 , 34.3);

        BoxWeight box2 = new BoxWeight(2 , 3 , 4 , 0.076);

        BoxWeight box3 = new BoxWeight();

        BoxWeight cube = new BoxWeight(3 , 2);

        BoxWeight clone = new BoxWeight(box1);

        double vol;

        vol = box1.volume();
        System.out.println("vol of box1 " + vol);
        System.out.println("the weight of box1 is " + box1.weight);
        System.out.println();


        vol = box2.volume();
        System.out.println("vol of box2 " + vol);
        System.out.println("the weight of box2 is " + box2.weight);
        System.out.println();


        vol = box3.volume();
        System.out.println("vol of box3 " + vol);
        System.out.println("the weight of box3 is " + box3.weight);
        System.out.println();

        vol = clone.volume();
        System.out.println("vol of clone " + vol);
        System.out.println("the weight of clone is " + clone.weight);
        System.out.println();

        vol = cube.volume();
        System.out.println("vol of cube " + vol);
        System.out.println("the weight of box2 is " + cube.weight);


    }
}
