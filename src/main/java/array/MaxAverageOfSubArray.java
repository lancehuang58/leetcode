package array;

public class MaxAverageOfSubArray {

    public double findMaxAverage(int[] nums, int k) {

        if (nums.length == 1) {
            return nums[0];
        }

        double firstSum = 0.0;

        for (int i = 0; i < k; i++) {
            firstSum += nums[i];
        }

        double init = firstSum;
        double max = firstSum;
        for (int i = k; i < nums.length; i++) {
            init += (nums[i] - nums[i - k]);
            max = Math.max(init, max);
        }

        return max / k;
    }
}
