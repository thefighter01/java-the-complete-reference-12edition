package comm;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer [] inums = {1 ,2, 3, 4 ,5};
        Stats<Integer> iOb = new Stats<>(inums);

        double av = iOb.average();
        System.out.println("iOb average is   "+av);

        Double [] dnums = {1.1 , 2.2 , 3.3 , 4.4 , 5.5};

        var dOb = new Stats<>(dnums);
        double avD = dOb.average();
        System.out.println("dOb average is   "+avD);

        Float [] f = {1.0F , 2.0F , 3.0F , 4.0F , 5.0F};
        var fOb = new Stats<>(f);
        double avF = fOb.average();
        System.out.println("fOb average is   "+avF);

        System.out.println("Averages of iOb and dOb ");
        if (iOb.isSameAverage(dOb)) System.out.println("same");
        else System.out.println("different");

        System.out.println();
        System.out.println("Averages of iOb and fOb ");
        if (iOb.isSameAverage(fOb)) System.out.println("same");
        else System.out.println("different");

    }
}
