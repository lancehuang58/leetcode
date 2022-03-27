package sort;

/**
 * selection sort
 *
 */
public class SelectionSort {

  public void sort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int temp;
        if (nums[i] > nums[j]) {
          temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
      }
    }
  }
}
