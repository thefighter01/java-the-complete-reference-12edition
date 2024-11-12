package comm;

public class GenMethDemo {

    static <T extends Comparable<T> , V extends T> boolean isIn(T x , V [] y){
        for (int i = 0; i < y.length; i++){
            if (x.equals(y[i])){
                return true;
            }
        }
        return false;
    }
    /*

    comparable is an interface declared in java.lang , a class impelements comparable defines objects that can be ordered
    thus requiring an upper bound of comparable ensures that isIn() can only be sued with objects that are capable of being compared
    comparable is generic , it's type parameter specifies the type of objects that it compares
     */
    public static void main(String[] args) {

        Integer [] nums = {1 , 2, 3, 4 , 5};

        if (isIn(2 , nums))
        {
            System.out.println(2 + " is in the nums array ");
        }

        if (GenMethDemo.<Integer , Integer>isIn(2 , nums)){
            System.out.println(2 + " is in the nums array version 2 ");
        }

        if (!isIn(7 , nums)) System.out.println(7 + " is not in the nums array ");
        System.out.println();

        if (isIn("two" , new String[]{"one " , "two" , "three"})){
            System.out.println("Two " + " is in the String  array ");

        }

        if (!isIn("seven" , new String []{"one" , "two" , "three"})){
            System.out.println("seven " + " is not in the String  array ");
        }

    }
}
