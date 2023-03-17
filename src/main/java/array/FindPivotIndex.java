package array;

public class FindPivotIndex {

    /**
     * @param nums integer array
     * @return index of pivot
     */
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sumOfLeft = getSumOfLeft(nums, i);
            int sumOfRight = getSumOfRight(nums, i);
//            System.out.printf("index %d, left %d - right %d \n", i, sumOfLeft, sumOfRight);
            if (sumOfRight == sumOfLeft) {
                return i;
            }
        }
        return 0;
    }

    private int getSumOfRight(int[] nums, int i) {
        int sum = 0;
        for (int j = i + 1; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }

    private int getSumOfLeft(int[] nums, int i) {
        int sum = 0;
        for (int j = i - 1; j >= 0; j--) {
            sum += nums[j];
        }
        return sum;
    }
}
