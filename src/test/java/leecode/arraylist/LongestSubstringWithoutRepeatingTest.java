package leecode.arraylist;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingTest {

  @Before
  public void setUp() {}

  @Test
  public void process() {
    LongestSubstringWithoutRepeating s = new LongestSubstringWithoutRepeating();
    int r = s.lengthOfLongestSubstring("abcabcbb");
    assertThat(r, Is.is(3));
  }
}
