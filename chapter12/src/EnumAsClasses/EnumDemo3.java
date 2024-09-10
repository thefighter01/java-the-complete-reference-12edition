package EnumAsClasses;


public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Winesap costs " + Apple.winesap.getPrice() + " cents \n");

        System.out.println("All apples prices");

        for (Apple apple : Apple.values()) {

            System.out.println(apple + "  costs " + apple.getPrice() + " cents \n");
        }
        // test for something in my mind
        // enum can't be superClass and can't be inherit but it can implement interfaces
        Apple.winesap.setPrice(299);
        for (Apple apple : Apple.values()) {

            System.out.println(apple + "  costs " + apple.getPrice() + " cents \n");
        }

    }
}
