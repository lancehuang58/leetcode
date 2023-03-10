package array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FizzBuzz {
  static Predicate<Integer> divisibleBy3 = i -> i % 3 == 0;
  static Predicate<Integer> divisibleBy5 = i -> i % 5 == 0;

  /** Time Complexity :　O(n) Space Complexity: O(1) */
  public static class Solution {

    public List<String> fizzBuzz(int n) {
      List<String> result = new ArrayList<>();
      for (int i = 1; i < n + 1; i++) {
        StringBuilder builder = new StringBuilder();

        if (divisibleBy3.test(i)) {
          builder.append("Fizz");
        }

        if (divisibleBy5.test(i)) {
          builder.append("Buzz");
        }

        if (builder.isEmpty()) {
          builder.append(i);
        }

        result.add(builder.toString());
      }
      return result;
    }
  }
}
