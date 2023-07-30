package hashmap;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
  private static class Solution{

    public int missingNumber(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
      }
      for (int i = 0; i <= nums.length; i++) {
        if(!set.contains(i))
        {
          return i;
        }
      }

      return 0;
    }
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int i = s.missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
    System.out.println(i);
  }
}
