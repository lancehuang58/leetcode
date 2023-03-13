package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindLongestArrayWithSumTest {
  FindLongestArrayWithSum.Solution solution = new FindLongestArrayWithSum.Solution();

  @Test
  void test_find_max_length_of_window_sum_equal_to_8() {
    int length = solution.findLength(new int[] {3, 1, 2, 7, 4, 2, 1, 1, 5}, 8);
    Assertions.assertThat(length).isEqualTo(4);
  }
}
