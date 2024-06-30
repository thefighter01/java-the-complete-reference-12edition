class Be{
    double width;
    double height;
    double depth;

    double volume (){
        return width*height*depth;
    }

}

public class BoxDemo4 {
    public static void main(String[] args) {
        Be bo = new Be();
        Be bo2 = new Be();
        double vol;

        // assign values to box
        bo.width = 10;
        bo.height = 20;
        bo.depth = 15;
        vol = bo.volume();
        System.out.println("the volume is " + vol);
        bo2.width = 3;
        bo2.height = 6;
        bo2.depth = 9;
        vol = bo2.volume();
        System.out.println("the volume is " + vol);


    }
}
