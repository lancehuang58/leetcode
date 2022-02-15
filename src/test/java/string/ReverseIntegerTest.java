package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {
  ReverseInteger processor = new ReverseInteger();

  @Test
  void test_reverse_integer() {
    int x = 321;
    int r = processor.reverse(x);
    assertThat(r).isEqualTo(123);
  }

  @Test
  void test_reverse_integer2() {
    int x = -123;
    int r = processor.reverse(x);
    assertThat(r).isEqualTo(-321);
  }

  @Test
  void test_reverse_integer3() {
    int x = 10;
    int r = processor.reverse(x);
    assertThat(r).isEqualTo(1);
  }
}
