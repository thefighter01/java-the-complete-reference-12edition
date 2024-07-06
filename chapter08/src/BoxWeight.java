public class BoxWeight extends Box {
     double weight;
     BoxWeight(double w , double h , double d , double weight) {
         super(w , h , d);
         this.weight = weight;

     }

     BoxWeight(BoxWeight boxWeight) {
         super(boxWeight);
         this.weight = boxWeight.weight;
     }

     BoxWeight(double len , double m) {
         super(len);
         this.weight = m;
     }
     BoxWeight(){
         super();
         this.weight = -1;
     }
}
