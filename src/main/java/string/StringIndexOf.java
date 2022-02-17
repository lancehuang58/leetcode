package string;

public class StringIndexOf {

  public int strStr(String haystack, String needle) {

    if (needle.isEmpty()) {
      return 0;
    }

    if (haystack.isEmpty()) {
      return -1;
    } else {
      if (haystack.length() >= needle.length()) {
        for (int i = 0; i < haystack.toCharArray().length; i++) {
          if (haystack.charAt(i) == needle.charAt(0)) {
            if (haystack.substring(i).length() < needle.length()) {
              return -1;
            }
            if (haystack.startsWith(needle, i)) {
              return i;
            }
          }
        }
      }
      return -1;
    }
  }
}
