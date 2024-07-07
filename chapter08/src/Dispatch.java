public class Dispatch {
   public static void main(String[] args) {
       ACallMe a = new ACallMe();
       BCallMe b = new BCallMe();
       CCallMe c = new CCallMe();

       ACallMe r;
       r = a;
       r.callMe();


       r = b;
       r.callMe();

       r = c;

       r.callMe();
   }
}
