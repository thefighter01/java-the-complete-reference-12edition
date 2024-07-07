public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9 , 5);
        Triangle t = new Triangle(10 , 8);

        Figure figuref ;

        figuref = r;
        System.out.println("Area of rectangle is " + figuref.getArea());


        figuref = t;
        System.out.println("Area of triangle is " + figuref.getArea());


        figuref = f;
        System.out.println("Area of non is " + figuref.getArea());



    }
}
