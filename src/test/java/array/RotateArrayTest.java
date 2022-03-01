package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

  @Test
  void test_reverse_array_with_location() {
    RotateArray processor = new RotateArray();
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    processor.rotate(nums, 3);
    Assertions.assertThat(nums).containsExactly(5, 6, 7, 1, 2, 3, 4);
  }
}
