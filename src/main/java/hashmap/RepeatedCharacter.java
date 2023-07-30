package hashmap;

/**
 * find first repeated character in string.
 */
public class RepeatedCharacter {
  private static class Solution {
	/**
	 * @param s input
	 * @return char for duplicate occurrence
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
  }

  public static void main(String[] args) {
	Solution solution = new Solution();
	char c = solution.repeatedCharacter("occurrence");
	System.out.println(c);
  }
}
