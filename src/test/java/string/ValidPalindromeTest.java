package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

  ValidPalindrome processor = new ValidPalindrome();

  @Test
  void case1() {
    boolean result = processor.isPalindrome("amanaplanacanalpanama");
    Assertions.assertThat(result).isTrue();
  }
//A man, a plan, a canal: Panama

  @Test
  void case1_1() {
    boolean result = processor.isPalindrome("A man, a plan, a canal: Panama");
    Assertions.assertThat(result).isTrue();
  }
  @Test
  void case2() {
    boolean result = processor.isPalindrome("race a car");
    Assertions.assertThat(result).isFalse();
  }

  @Test
  void case3() {
    boolean result = processor.isPalindrome(" ");
    Assertions.assertThat(result).isTrue();
  }

  @Test
  void case4() {
    boolean result = processor.isPalindrome("0P");
    Assertions.assertThat(result).isFalse();
  }
}
