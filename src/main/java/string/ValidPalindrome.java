package string;

import static java.lang.Character.isLetterOrDigit;

public class ValidPalindrome {

  public boolean isPalindrome(String s) {

    if (s == null || s.isEmpty()) {
      return true;
    }

    s = s.toLowerCase();
    int right = s.length() - 1;
    int left = 0;

    while (left <= right) {
      char leftChar = s.charAt(left);
      char rightChar = s.charAt(right);

      if (!isLetterOrDigit(leftChar)) {
        left++;
      } else if (!isLetterOrDigit(rightChar)) {
        right--;
      } else {
        if (leftChar != rightChar) {
          return false;
        }
        left++;
        right--;
      }
    }

    return true;
  }
}
