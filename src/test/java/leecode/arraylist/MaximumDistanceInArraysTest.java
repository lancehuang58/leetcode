package leecode.arraylist;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MaximumDistanceInArraysTest {

  int[][] array1 = {{1, 2, 3}, {4, 5}, {1, 2, 3}};

  @Test
  public void test() {
    MaximumDistanceInArrays maximumDistanceInArrays = new MaximumDistanceInArrays();
    int result = maximumDistanceInArrays.maxDistance(array1);
    assertThat(result).isEqualTo(4);
  }
}
