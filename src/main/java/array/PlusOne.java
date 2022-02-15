package array;

public class PlusOne {

  public int[] execute(int[] nums) {

    int n = nums.length;

    for (int i = n - 1; i >= 0; i--) {
      if (nums[i] < 9) {
        nums[i]++;
        return nums;
      }
      nums[i] = 0;
    }

    int[] newNumbers = new int[n + 1];
    newNumbers[0] = 1;
    return newNumbers;
  }
}