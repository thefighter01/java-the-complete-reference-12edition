package version5;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);

        Gen2<Integer> iOb2 = new Gen2<>(99);

        Gen2<String> strOb2 = new Gen2<>("Generics Test");

        /*
        instance of determines weather an object type is of the specified type or it can be casted to the specified type
         */

        if (iOb2 instanceof Gen){ // it will be printed
            System.out.println("iOb2 is instance of Gen");
        }
        if (iOb2 instanceof Gen<?>){
            System.out.println("iOb2 is instance of Gen");
        }
        System.out.println();

        if (strOb2 instanceof Gen2<?>){ // it will be printed
            System.out.println("strOb2 is instance of Gen2");
        }

        if (strOb2 instanceof Gen<?>){ // it will be printed
            System.out.println("strOb2 is instance of Gen");
        }

        System.out.println();

        if (iOb instanceof Gen2<?>){ // it will not be printed
            System.out.println("iOb is an instance of Gen2");
        }

        if (iOb instanceof Gen<?>){ // it will be printed
            System.out.println("iOb is an instance of Gen");
        }





    }
}
