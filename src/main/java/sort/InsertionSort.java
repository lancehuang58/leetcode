package sort;

public class InsertionSort {
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            int j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                int key = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = key;
                j = j - 1;
            }
        }
    }
}
