package sort;

public class ShellSort {

    public void sort(int[] nums) {
        int gap = nums.length / 2;
        int i, j, temp;

        for (; gap > 0; gap = gap / 2) {
            for (i = gap; i < nums.length; i++) {
                temp = nums[i];
                for (j = i; j >= gap && temp < nums[j - gap]; j -= gap) {
                    nums[j] = nums[j - gap];
                }
                nums[j] = temp;
            }
        }
    }
}
