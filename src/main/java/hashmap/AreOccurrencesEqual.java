package hashmap;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
public class AreOccurrencesEqual {

  static class Solution {
	public boolean areOccurrencesEqual(String s) {
	  Map<Character, Integer> map = new HashMap<>();
	  for (char c : s.toCharArray()) {
		map.put(c, map.getOrDefault(c, 0) + 1);
	  }

	  Set<Integer> hashMap = new HashSet<>(map.values());
	  return hashMap.size() == 1;
	}
  }

  public static void main(String[] args) {
	var solution = new Solution();
	var r = solution.areOccurrencesEqual("aaabb");
	log.info("r	 {}", r);
	var c = solution.areOccurrencesEqual("aaaccc");
	log.info("c	 {}", c);
  }
}
