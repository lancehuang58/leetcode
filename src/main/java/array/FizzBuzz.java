package array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FizzBuzz {
    static Predicate<Integer> divisibleBy3 = i -> i % 3 == 0;
    static Predicate<Integer> divisibleBy5 = i -> i % 5 == 0;


    /**
     * Time Complexity :　O(n)
     * Space Complexity: O(1)
     */
    public static class Solution {

        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                if (divisibleBy3.test(i) && divisibleBy5.test(i)) {
                    result.add("FizzBuzz");
                } else if (divisibleBy3.test(i)) {
                    result.add("Fizz");
                } else if (divisibleBy5.test(i)) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }
            return result;
        }
    }
}
