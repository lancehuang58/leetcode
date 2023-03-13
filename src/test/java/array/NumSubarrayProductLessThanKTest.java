package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumSubarrayProductLessThanKTest {
  NumSubarrayProductLessThanK.Solution solution = new NumSubarrayProductLessThanK.Solution();

  @Test
  void test() {
    int n = solution.numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100);
    Assertions.assertThat(n).isEqualTo(8);
  }
}
