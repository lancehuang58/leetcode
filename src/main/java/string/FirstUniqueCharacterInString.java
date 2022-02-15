package string;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class FirstUniqueCharacterInString {

  public int firstUniqueChar(String s) {

    Stream<Character> cs = s.chars().mapToObj(c -> (char) c);
    Map<Character, Integer> charCounting =
        cs.collect(groupingBy(identity(), collectingAndThen(counting(), Long::intValue)));

    for (int i = 0; i < s.length(); i++) {
      if (charCounting.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
