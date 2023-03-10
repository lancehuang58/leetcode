package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfStepToReduceANumberToZeroTest {
  NumberOfStepToReduceANumberToZero.Solution solution =
      new NumberOfStepToReduceANumberToZero.Solution();

  @Test
  void test_solution() {
    int i = solution.numberOfSteps(14);
    assertThat(i).isEqualTo(6);
  }

  @Test
  void test_solution2() {
    int i = solution.numberOfStep2(14);
    assertThat(i).isEqualTo(6);
  }
}
