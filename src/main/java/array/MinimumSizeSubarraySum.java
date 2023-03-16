package array;

public class MinimumSizeSubarraySum {
    /**
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {

        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) {
                    min = Math.min(min, j - i + 1);
                    break;
                }
            }
        }
        return min;
    }
}
