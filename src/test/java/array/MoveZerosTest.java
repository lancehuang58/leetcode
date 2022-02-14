package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {
  MoveZeros processor = new MoveZeros();

  @Test
  void moveZeros() {
    int[] nums = {0, 1, 0, 3, 12};
    processor.moveZeros(nums);
    Assertions.assertThat(nums).containsExactly(1, 3, 12, 0, 0);
  }
}
