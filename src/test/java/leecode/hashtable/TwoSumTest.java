package leecode.hashtable;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

  @Test
  public void two_sum_simple() {
    TwoSum solution = new TwoSum();
    int[] intIndex = solution.violenceSolution(new int[] {1, 3, 4, 5, 7}, 12);
    assertThat(intIndex[0]).isEqualTo(3);
    assertThat(intIndex[1]).isEqualTo(4);
  }

  @Test
  public void twosum_map() {
    TwoSum solution = new TwoSum();
    int[] intIndex = solution.mapSolution(new int[] {1, 3, 4, 5, 7}, 12);
    assertThat(intIndex[0]).isEqualTo(3);
    assertThat(intIndex[1]).isEqualTo(4);
  }

  @Test
  public void twosum_two_pointer() {
    TwoSum solution = new TwoSum();
    int[] intIndex = solution.twoPointerSolution(new int[] {1, 3, 4, 5, 7}, 12);
    assertThat(intIndex[0]).isEqualTo(3);
    assertThat(intIndex[1]).isEqualTo(4);
  }
}
