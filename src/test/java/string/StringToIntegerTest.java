package string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class StringToIntegerTest {
  StringToInteger processor = new StringToInteger();

  @Test
  void test() {
    int i = processor.myAtoi("42");
    Assertions.assertThat(i).isEqualTo(42);
  }

  @Test
  void test2() {
    int i = processor.myAtoi("   -42");
    Assertions.assertThat(i).isEqualTo(-42);
  }
}
