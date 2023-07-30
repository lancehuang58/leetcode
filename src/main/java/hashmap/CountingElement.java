package hashmap;

import java.util.HashSet;
import java.util.Set;

public class CountingElement {

  private static class Solution {

	public int countElements(int[] arr) {
	  Set<Integer> set = new HashSet<>();
	  int count = 0;
	  for (int j : arr) {
		set.add(j);
	  }

	  for (int i : arr) {
		int target = i + 1;
		if (set.contains(target)) {
		  count++;
		}
	  }

	  return count;
	}
  }

  public static void main(String[] args) {
	Solution s = new Solution();
	int r = s.countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7});
	System.out.println(r);
  }
}
