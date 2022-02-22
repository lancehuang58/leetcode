package linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
  Palindrome processor = new Palindrome();

  @Test
  void test_is_palindrome() {
    final boolean palindrome = processor.isPalindrome(ListNode.of(1, 2, 2, 1));
    Assertions.assertThat(palindrome).isTrue();
  }

  @Test
  void test_is_not_palindrome() {
    final boolean palindrome = processor.isPalindrome(ListNode.of(1, 2));
    Assertions.assertThat(palindrome).isFalse();
  }
}
