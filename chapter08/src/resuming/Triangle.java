package resuming;


 class Triangle extends Figure{
    Triangle (double a, double b) {
        super(a, b);
    }

    double getArea(){
        System.out.println("area inside triangle");
        return dim1 * dim2 / 2;
    }
}
