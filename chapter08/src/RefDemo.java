public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightBox = new BoxWeight(3 , 5 , 7 , 8.37);
        Box plainBox = new Box();

        double vol;

        vol = weightBox.volume();

        System.out.println("the value of vol for weightBox  is " + vol);
        System.out.println("the Weight of weightBox is "+ weightBox.weight);

        System.out.println();

        plainBox = weightBox;
        vol = weightBox.volume();
        System.out.println("the value of vol for plainBox  is " + vol);

        // the reference variable determines which member can we access not the object type
      //  System.out.println("Weight of plaintBox is "+ plainBox.weight);
    }
}
