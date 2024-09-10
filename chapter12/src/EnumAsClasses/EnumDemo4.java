package EnumAsClasses;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        System.out.println("Here are all the ordinal and their constant values");
        for (Apple apple : Apple.values()) {
            System.out.println(apple + " is " + apple.ordinal());
        }

        ap = Apple.RedDel;

        ap2 = Apple.GoldenDel;
        Answers an;
        an = Answers.NEVER;

        ap3 = Apple.RedDel;
        System.out.println();

        if (ap.compareTo(ap2) < 0) { // compare ordinal values
            System.out.println(ap + " comes before " + ap2);
        }

        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap + " comes after " + ap2);
        }

        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap3 + " is equal to " + ap);
        }
//        // this should give me an error
//        if (ap.compareTo(an) == 0) {
//            System.out.println(ap + " is equal to " + an);
//        }

        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("Erorr");
        }

        if (ap.equals(ap3)) {
            System.out.println(ap + " is equal to " + ap3);
        }

        if (ap.equals(an)){
            System.out.println(ap + " is equal to " + an);
        }else {
            System.out.println(ap + " is not equal to " + an);
        }
    }

}
