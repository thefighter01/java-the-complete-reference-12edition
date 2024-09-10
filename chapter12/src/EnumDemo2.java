public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("here are all Apple constants");

        Apple [] allApples = Apple.values();
        for (Apple apple : allApples) {
            System.out.println(apple);
        }
        System.out.println();

        ap = Apple.valueOf("Jonathan");
        System.out.println(ap);


        Apple a;
        // each enumeration constant is an enumeration object of type the enclosing enum
        a = Apple.valueOf("Jonathan");
        System.out.println(a);


    }
}
