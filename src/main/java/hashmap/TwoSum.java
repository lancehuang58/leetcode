package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  /**
   *
   */
  private static class Solution {
	/**
	 * @param nums   number array
	 * @param target target value
	 * @return index of two sum
	 */
	public int[] twoSum(int[] nums, int target) {
	  Map<Integer, Integer> dictionary = new HashMap<>();
	  for (int i = 0; i < nums.length; i++) {
		int current = nums[i];
		int comp = target - current;
		if (dictionary.containsKey(comp)) {
		  return new int[]{i, dictionary.get(comp)};
		}
		dictionary.put(current, i);
	  }
	  return new int[]{-1, -1};
	}
  }

  public static void main(String[] args) {
	Solution solution = new Solution();
	int[] r = solution.twoSum(new int[]{1, 2, 3}, 5);
	System.out.println(Arrays.toString(r));
  }
}
