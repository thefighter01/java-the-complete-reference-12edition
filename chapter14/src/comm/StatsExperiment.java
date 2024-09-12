package comm;

public class StatsExperiment <T>{
    T [] nums;
    StatsExperiment(T [] nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
          //  sum+= nums[i].doubleValue();
            // this will cause error
        }
        return sum/nums.length;
    }


}
