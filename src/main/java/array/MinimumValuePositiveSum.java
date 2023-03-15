package array;

public class MinimumValuePositiveSum {

    public int minStartValue(int[] nums) {
        int prefixSum = 0;
        int min = 0;

        for (int num : nums) {
            prefixSum += num;
            min = Math.min(prefixSum, min);
        }
        return 1 - min;
    }
}
