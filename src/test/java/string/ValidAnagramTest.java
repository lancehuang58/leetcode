package string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

  ValidAnagram processor = new ValidAnagram();

  @Test
  void test_validation() {
    boolean r = processor.isAnagram("abc", "cba");
    Assertions.assertTrue(r);
  }

  @Test
  void test_validation2() {
    boolean r = processor.isAnagram("anagram", "nagaram");
    Assertions.assertTrue(r);
  }

  @Test
  void test_validation3() {
    boolean r = processor.isAnagram("rat", "car");
    Assertions.assertFalse(r);
  }
}
