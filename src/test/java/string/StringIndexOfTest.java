package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringIndexOfTest {
  StringIndexOf processor = new StringIndexOf();

  @Test
  void case1() {
    int i = processor.strStr("hello", "ll");
    assertThat(i).isEqualTo(2);
  }

  @Test
  void case2() {
    int i = processor.strStr("a", "");
    assertThat(i).isEqualTo(0);
  }
}
