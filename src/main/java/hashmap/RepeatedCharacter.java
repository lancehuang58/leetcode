package hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * find first repeated character in string.
 */
public class RepeatedCharacter {
  private static class Solution {
	/**
	 * brute force
	 * @param s input
	 * @return char for duplicate oc currence
	 */
	public char repeatedCharacter(String s) {
	  char[] array = s.toCharArray();

	  for (int i = 0; i < array.length; i++) {
		char current = array[i];

		for (int j = i + 1; j < array.length; j++) {
		  if (array[j] == current) {
			return current;
		  }
		}
	  }
	  return '!';
	}

	/**
	 * hashmap solution
	 * @param s input
	 * @return char for duplicate occurrence
	 */
	public char repeatedCharacter2(String s) {
	  char[] array = s.toCharArray();
	  Set<Character> collectedChars = new HashSet<>();
	  for (char current : array) {
		if (collectedChars.contains(current)) {
		  return current;
		}
		collectedChars.add(current);
	  }
	  return '!';
	}
  }

  public static void main(String[] args) {
	Solution solution = new Solution();
	char c = solution.repeatedCharacter2("gauge");
	System.out.println(c);
  }
}
