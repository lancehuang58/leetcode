package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

  SingleNumber processor = new SingleNumber();

  @Test
  void test() {
    int r = processor.process(new int[] {4, 1, 2, 1, 2});
    Assertions.assertThat(r).isEqualTo(4);
  }
}
