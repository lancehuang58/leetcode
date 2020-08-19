package leecode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    return tranditionalway(s, t);
  }

  private boolean tranditionalway(String s, String t) {
    Map<Character, Integer> charCountMap = getCharCountMap(s.toCharArray());
    char[] chars = t.toCharArray();
    for (char c : chars) {
      Integer integer = charCountMap.get(c);
      if (integer == null) {
        return false;
      }
      integer--;
      if (integer == 0) {
        charCountMap.remove(c);
      } else {
        charCountMap.put(c, integer);
      }
    }
    return charCountMap.isEmpty();
  }

  private boolean compareWith2Map(String s, String t) {
    char[] chars = s.toCharArray();
    char[] chart = t.toCharArray();
    Map<Character, Integer> charMaps = getCharCountMap(chars);
    Map<Character, Integer> charMapt = getCharCountMap(chart);
    return charMaps.equals(charMapt);
  }

  private Map<Character, Integer> getCharCountMap(char[] chars) {
    Map<Character, Integer> charMap = new HashMap<>();
    for (int i = 0; i < chars.length; i++) {
      charMap.merge(chars[i], 1, Integer::sum);
    }
    return charMap;
  }
}
