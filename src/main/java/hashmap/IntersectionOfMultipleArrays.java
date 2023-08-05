package hashmap;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
@Slf4j
public class IntersectionOfMultipleArrays
{

  static class Solution {
	public List<Integer> intersection(int[][] nums) {
	  Map<Integer, Integer> counts = new HashMap<>();
	  for (int[] arr: nums) {
		for (int x: arr) {
		  counts.put(x, counts.getOrDefault(x, 0) + 1);
		}
	  }

	  int n = nums.length;
	  List<Integer> ans = new ArrayList<>();
	  for (int key: counts.keySet()) {
		if (counts.get(key) == n) {
		  ans.add(key);
		}
	  }

	  Collections.sort(ans);
	  return ans;
	}
  }

  public static void main(String[] args) {
	Solution solution = new Solution();
	var intersection = solution.intersection(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}});
	log.info("intersection {}", intersection);
  }
}
