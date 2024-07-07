public class Shipment extends BoxWeight{
    double cost;
    Shipment(Shipment shipment){
        super(shipment);
        this.cost = shipment.cost;
    }
    Shipment() {
        super();
        cost = -1;
    }
    Shipment(double len , double m , double c) {
        super(len , m);
        cost = c;
    }
    Shipment(double w , double h , double d , double m ,
             double c) {
        super(w , h , d , m);
        cost = c;
    }

}
