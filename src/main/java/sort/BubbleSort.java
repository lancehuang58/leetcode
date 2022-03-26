package sort;

public class BubbleSort {

    public void execute(int[] nums) {
        int temp;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int k = j + 1;
                if (nums[k] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[k];
                    nums[k] = temp;
                }
            }
        }
    }
}
