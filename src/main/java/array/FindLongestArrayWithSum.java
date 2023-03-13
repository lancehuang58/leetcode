package array;

public class FindLongestArrayWithSum {
  public static class Solution {
    /**
     * @param nums input
     * @param k limit
     * @return max length
     */
    public int findLength(int[] nums, int k) {
      int left = 0;
      int current = 0;
      int ans = 0;
      for (int right = 0; right < nums.length; right++) {
        current += nums[right];
        while (current > k) {
          current -= nums[left];
          left++;
        }
        ans = Math.max(ans, right - left + 1);
      }
      return ans;
    }
  }
}
