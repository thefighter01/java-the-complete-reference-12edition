public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] nums = new int [10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        for (int x : nums ){
            System.out.println("the value of x is "+x);
            sum+=x;
            if (x == 5) break;
        }
        System.out.println("the sum of the first 5 numbers  is "+sum);
    }
}
