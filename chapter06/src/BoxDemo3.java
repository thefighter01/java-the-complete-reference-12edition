
class Bo{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("Volume is " + width * height * depth);
    }
}
public class BoxDemo3 {
    public static void main(String[] args) {
        Bo bo = new Bo();
        Bo bo2 = new Bo();

        // assign values to box
        bo.width = 10;
        bo.height = 20;
        bo.depth = 15;
        bo.volume();


        bo2.width = 3;
        bo2.height = 6;
        bo2.depth = 9;
        bo2.volume();


    }
}
