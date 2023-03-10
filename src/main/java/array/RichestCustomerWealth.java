package array;

import java.util.Arrays;

/** Time Complexity: O(n x m) Space Complexity: O(1) */
public class RichestCustomerWealth {

  public static class Solution {

    public int maximumWealth(int[][] accounts) {

      int max = 0;

      for (int[] account : accounts) {
        max = Math.max(max, Arrays.stream(account).sum());
      }

      return max;
    }
  }
}
