class Bex{
    double width;
    double height;
    double depth;

    double volume (){
        return width*height*depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Bex bo = new Bex();
        Bex bo2 = new Bex();
        double vol;

        // assign values to box

        bo.setDim(10 , 20 , 15);
        vol = bo.volume();
        System.out.println("the volume is " + vol);

        bo2.setDim(3, 6 , 9);
        vol = bo2.volume();
        System.out.println("the volume is " + vol);


    }
}
