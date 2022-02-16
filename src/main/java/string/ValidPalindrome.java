package string;

import java.util.stream.Collector;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    if (s == null || s.isEmpty()) {
      return true;
    }

    s =
        s.toLowerCase()
            .chars()
            .filter(x -> (x >= 97 && x <= 122) || (x>=48 && x<=57))
            .mapToObj(c -> (char) c)
            .collect(
                Collector.of(
                    StringBuilder::new,
                    StringBuilder::append,
                    StringBuilder::append,
                    StringBuilder::toString));

    if (s.length() == 1) {
      return true;
    }

    int n = s.length() / 2;
    int front = 0;
    int end = s.length() - 1;

    for (int i = 0; i < n; i++) {
      if (s.charAt(front) != s.charAt(end)) {
        return false;
      }
      front++;
      end--;
    }

    return true;
  }
}
