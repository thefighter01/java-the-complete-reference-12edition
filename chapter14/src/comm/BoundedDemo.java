package comm;

public class BoundedDemo {
    public static void main(String[] args) {
        Integer [] inums = {1 ,2, 3, 4 ,5};
        Stats<Integer> iOb = new Stats<>(inums);

        double av = iOb.average();
        System.out.println("iOb average is   "+av);

        Double [] dnums = {1.1 , 2.2 , 3.3 , 4.4 , 5.5};

        var dOb = new Stats<>(dnums);
        double avD = dOb.average();
        System.out.println("dOb average is   "+avD);

        String [] strs = {"1" , "2" , "3" , "4" , "5"};

        //var strObj = new Stats<String>(strs); // this will not work because it's an object of type that is not a Number or a subclass of Number

    }
}
