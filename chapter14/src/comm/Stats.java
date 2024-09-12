package comm;

public class Stats <T extends Number>{
    T [] nums;
    Stats(T [] nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
             sum+= nums[i].doubleValue();
        }
        return sum/nums.length;
    }

    boolean isSameAverage(Stats<?> stats){
        if (this.average() == stats.average()){
            return true;
        }
        return false;

    }
}
