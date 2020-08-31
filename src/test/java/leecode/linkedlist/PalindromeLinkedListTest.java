package leecode.linkedlist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromeLinkedListTest {

  PalindromeLinkedList solution;

  @Before
  public void setUp() throws Exception {
    solution = new PalindromeLinkedList();
  }

  @Test
  public void given_empty_array_return_false() {
    boolean r = solution.isPalindrome(ListNodeBuilder.buildNode(new int[] {}));
    assertFalse(r);
  }

  @Test
  public void given_null_array_return_false() {
    boolean r = solution.isPalindrome(null);
    assertFalse(r);
  }

  @Test
  public void given_sunny_case_return_true() {
    boolean r = solution.isPalindrome(ListNodeBuilder.buildNode(new int[] {1, 2, 3, 4, 4, 3, 2, 1}));
    assertTrue(r);
  }

  @Test
  public void given_sunny_case2_return_true() {
    boolean r = solution.isPalindrome(ListNodeBuilder.buildNode(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1}));
    assertTrue(r);
  }
}
