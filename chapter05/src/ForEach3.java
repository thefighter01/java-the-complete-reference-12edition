public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int [][] nums = new int[3][5];
        // put the values;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i+1) * (j + 1);
            }
        }
        for (int [] num : nums){
            for (int y : num){
                System.out.print(y + " ");
                sum+=y;
            }
            num[0] = 0;
            System.out.println();
        }
        System.out.println(sum);

        for (int [] num : nums){
            for (int y : num){
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
