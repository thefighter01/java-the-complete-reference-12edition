package src;

public class Average {
    public static void main(String[] args) {
        double [] nums = {10.1 , 11,2 , 12.3, 13.4 , 14.5};
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.println("result is  "+ result/ nums.length);

    }
}
