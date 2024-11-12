package version6;

public class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1 , 2, 3, 4, 5};

        GenArray<Integer> iOb = new GenArray<Integer>(10 , n);

        GenArray<Long> iOb2 = new GenArray<Long>(5L , new Long []{51L , 22L});

       GenArray<?> [] gens = new GenArray [10];

       gens[0] = iOb;
       gens[1] = iOb2;

       System.out.println(gens[0].getOb());
       System.out.println(gens[1].getOb());



    }
}
