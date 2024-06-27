import javax.swing.plaf.synth.SynthUI;

public class ForEach {
    public static void main(String[] args) {
        int []nums  = new int [10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i+1;
        }
        int sum = 0;
        for (int x : nums){
            System.out.println("x = "+x);
            sum+=x;
            x = 10;
        }
        System.out.println("sum = "+sum);

        for (int x : nums){
            System.out.println("x = "+x);
        }



    }
}
