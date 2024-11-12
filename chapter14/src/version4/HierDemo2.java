package version4;

public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> w= new Gen<>("hello" , 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
