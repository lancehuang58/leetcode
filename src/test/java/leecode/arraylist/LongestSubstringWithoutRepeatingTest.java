package leecode.arraylist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingTest {

  @Test
  public void process() {
    LongestSubstringWithoutRepeating s = new LongestSubstringWithoutRepeating();
    int r = s.lengthOfLongestSubstring("abcabcbb");
    assertThat(r).isEqualTo(3);
  }
}
