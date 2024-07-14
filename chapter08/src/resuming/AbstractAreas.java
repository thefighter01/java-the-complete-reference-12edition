package resuming;

public class AbstractAreas {
    public static void main(String[] args) {
        // i can not instantiate an object of figure class because it is an abstract class
        Rectangle r = new Rectangle(9 , 5);
        Triangle t = new Triangle(10 , 8);

        Figure f;
        f = r;
        System.out.println(f.getArea());

        f = t;
        System.out.println(f.getArea());
    }
}
