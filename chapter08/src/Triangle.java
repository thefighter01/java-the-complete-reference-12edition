
class Triangle extends Figure{
    Triangle(double x1, double y1) {
        super(x1, y1);
    }

    double getArea(){
        return dim1 * dim2 / 2;
    }
}
