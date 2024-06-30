public class BoxC {
    double with;
    double height;
    double depth;

    BoxC(){
        System.out.println("Constructing BoxC");
        with = 10;
        height = 10;
        depth = 10;
    }

    BoxC(double with, double height, double depth){
        this.with = with;
        this.height = height;
        this.depth = depth;

    }

    double volume(){
        return with * height * depth;
    }
}

