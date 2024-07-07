class Rectangle extends Figure{
    Rectangle(double x, double y) {
        super(x, y);
    }
    double getArea() {
        return dim1 * dim2;
    }

}
