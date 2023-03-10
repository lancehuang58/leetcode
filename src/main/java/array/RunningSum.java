package array;

public class RunningSum {

  public static class Solution {

    public int[] runningSum(int[] nums) {
      int[] newNums = new int[nums.length];
      newNums[0] = nums[0];
      for (int x = 1; x < nums.length; x++) {
        newNums[x] = newNums[x - 1] + nums[x];
      }
      return newNums;
    }
  }
}
