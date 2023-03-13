package array;

public class NumSubarrayProductLessThanK {

  public static class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int curr = 1;
      int result = 0;
      int left = 0;

      for (int right = 0; right < nums.length; right++) {
        curr *= nums[right];

        while (curr >= k) {
          curr /= nums[left];
          left++;
        }
        result += right - left + 1;
      }

      return result;
    }
  }
}
