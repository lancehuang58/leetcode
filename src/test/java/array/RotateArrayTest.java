package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateArrayTest {


  @Test
  void test() {
    RotateArray processor = new RotateArray();
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    processor.rotate(nums, 3);
    System.out.println(Arrays.toString(nums));
    Assertions.assertThat(nums).containsExactly(5, 6, 7, 1, 2, 3, 4);
  }
}
