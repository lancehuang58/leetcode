package hashmap;

import java.util.HashSet;
import java.util.Set;

public class CheckStringIsPangram {
  private static class Solution {

	public boolean checkIfStringIsPangram(String sentence) {
	  char[] array = sentence.toCharArray();
	  Set<Character> set = new HashSet<>();
	  for (char c : array) {
		set.add(c);
	  }
	  return set.size() == 26;
	}
  }

  public static void main(String[] args) {
	Solution solution = new Solution();
	boolean r = solution.checkIfStringIsPangram(
		"thequickbrownfoxjumpsoverthelazydog");
	System.out.println(r);
  }
}
