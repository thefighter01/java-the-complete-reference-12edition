package resuming;

class Rectangle extends Figure{
    Rectangle(double a , double b){
        super(a , b);
    }

    double getArea(){
        System.out.println("area inside Rectangle");
        return dim1 * dim2;
    }
}
