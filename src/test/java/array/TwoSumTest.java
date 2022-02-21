package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  TwoSum processor = new TwoSum();

  @Test
  void test_two_sum() {
    int[] result = processor.twoSum(new int[] { 2, 7, 11, 15 }, 9);
    Assertions.assertThat(result).containsExactly(0, 1);
  }

  @Test
  void test_two_sum2() {
    int[] result = processor.twoSum(new int[] { 3, 2, 4 }, 6);
    Assertions.assertThat(result).containsExactly(1, 2);
  }

  @Test
  void test_two_sum3() {
    int[] result = processor.twoSum(new int[] { 3, 2, 3 }, 6);
    Assertions.assertThat(result).containsExactly(0, 2);
  }
}
