public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;
        isPrime = (num < 2 ? false : true);
        for (int i = 2; i < num/ i ; ++i){
            if ((num % i) == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Prime number");
        }
        else
            System.out.println("Not Prime number");


    }
}
