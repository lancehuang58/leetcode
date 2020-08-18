package leecode.arraylist;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

  /** get length of substring. */
  public int lengthOfLongestSubstring(String s) {
    if (s.isEmpty()) {
      return 0;
    }

    int maxLength = 0;

    Map<Character, Integer> cache = new HashMap<>();

    for (int i = 0, j = 0; i < s.length(); i++) {
      if (cache.containsKey(s.charAt(i))) {
        j = Math.max(j, cache.get(s.charAt(i)) + 1);
      }
      cache.put(s.charAt(i), i);
      maxLength = Math.max(maxLength, i - j + 1);
    }

    return maxLength;
  }
}
