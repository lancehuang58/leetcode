package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

  char[] chars = new char[] {'a', 'b', 'c'};

  ReverseString processor = new ReverseString();

  @Test
  void test_reverse_string() {
    processor.reverseString(chars);
    Assertions.assertThat(chars).containsExactly('c', 'b', 'a');
  }
}
