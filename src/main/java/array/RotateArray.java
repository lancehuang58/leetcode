package array;

public class RotateArray {

  public void rotate(int[] nums, int k) {
    rotateArray(nums, 0, nums.length - 1);
    rotateArray(nums, 0, k - 1);
    rotateArray(nums, k, nums.length - 1);
  }

  private void rotateArray(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
