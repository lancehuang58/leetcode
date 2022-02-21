package array;

public class MoveZeros {

  public void moveZeros(int[] nums) {

    if (nums.length <= 1)
      return;

    int left = 0;
    int right = 0;
    int temp;

    while (right < nums.length) {
      if (nums[right] != 0) {
        temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        ++left;
      }
      ++right;
    }
  }
}
