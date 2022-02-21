package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
  LongestCommonPrefix processor = new LongestCommonPrefix();

  @Test
  void case1() {
    String prefix = processor.longestCommonPrefix(new String[] { "dog", "racecar", "car" });
    Assertions.assertThat(prefix).isEmpty();
  }

  @Test
  void case2() {
    String prefix = processor.longestCommonPrefix(new String[] { "flowers", "flow", "floor" });
    Assertions.assertThat(prefix).isEqualTo("flo");
  }
}
