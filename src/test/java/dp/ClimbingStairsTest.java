package dp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ClimbingStairsTest {
  ClimbingStairs processor = new ClimbingStairs();

  @Test
  void climb() {
    int r = processor.climbStairs(1);
    Assertions.assertThat(r).isEqualTo(1);
  }

  @Test
  void climb2() {
    int r = processor.climbStairs(2);
    Assertions.assertThat(r).isEqualTo(2);
  }

  @Test
  void climb3() {
    int r = processor.climbStairs(3);
    Assertions.assertThat(r).isEqualTo(3);
  }

  @Test
  void climb4() {
    int r = processor.climbStairs(4);
    Assertions.assertThat(r).isEqualTo(5);
  }
}
