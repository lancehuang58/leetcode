package leetcode;

import static org.junit.Assert.*;


import org.junit.Test;

public class RemoveDuplicateNumberTest {

  @Test
  public void test() {
    final int i = new RemoveDuplicateNumber().removeDuplicates(new int[]{1, 1, 2, 2, 5, 5});
    assertEquals(i, 3);
  }

  @Test
  public void test2() {
    assertEquals(new RemoveDuplicateNumber().removeDuplicates(null), 0);
    assertEquals(new RemoveDuplicateNumber().removeDuplicates(new int[]{}), 0);

  }
}