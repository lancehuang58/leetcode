package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class FirstUniqueCharacterInStringTest {
  FirstUniqueCharacterInString processor = new FirstUniqueCharacterInString();

  @Test
  void test() {
    int r = processor.firstUniqueChar("leetcode");
    Assertions.assertThat(r).isEqualTo(0);
  }
}
