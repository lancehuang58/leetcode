package hashmap;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class FindLongestSubString {


  static class Solution {
	public int findLongestSubstring(String s, int k) {
	  int ans = 0;
	  int left = 0;
	  Map<Character, Integer> counts = new HashMap<>();

	  for (int right = 0; right < s.length(); right++) {
		char c = s.charAt(right);
		counts.put(c, counts.getOrDefault(c, 0) + 1);

		while (counts.size() > k) {
		  char remove = s.charAt(left);
		  counts.put(remove, counts.getOrDefault(remove, 0) - 1);
		  if (counts.get(remove) == 0) {
			counts.remove(remove);
		  }
		  left++;
		}
		log.info("substring {},  {}",left +", "+ right, s.substring(left, right+1) );

		ans = Math.max(ans, right - left + 1);
	  }
	  return ans;
	}
  }

  public static void main(String[] args) {
	Solution solution = new Solution();
	int substring = solution.findLongestSubstring("axvaeecf", 3);
	log.info("string length -> {}", substring);
  }
}
