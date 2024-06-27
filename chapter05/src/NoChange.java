public class NoChange {
    public static void main(String[] args) {
        int []nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        for (int x : nums){
            System.out.println("the value of x is " + x);
            x *= 10;
        }
        System.out.println();

        for (int x : nums){
            System.out.println("the value of x is " + x);
        }

    }
}
