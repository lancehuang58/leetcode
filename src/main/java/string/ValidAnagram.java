package string;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] array = new int[128];
    for (int i = 0; i < s.length(); i++) {
      array[s.charAt(i)]++;
      array[t.charAt(i)]--;
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
