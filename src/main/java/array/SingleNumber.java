package array;

public class SingleNumber {

  public int process(int[] nums) {
    int reuslt = 0;
    for (int i = 0; i < nums.length; i++) {
      reuslt ^= nums[i];
    }
    return reuslt;
  }
}
