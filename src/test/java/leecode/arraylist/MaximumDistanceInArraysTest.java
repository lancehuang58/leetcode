package leecode.arraylist;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MaximumDistanceInArraysTest {

  int[][] array1 = {{1, 2, 3}, {4, 5}, {1, 2, 3}};

  @Test
  public void test() {
    MaximumDistanceInArrays maximumDistanceInArrays = new MaximumDistanceInArrays();
    int result = maximumDistanceInArrays.maxDistance(array1);
    Assert.assertThat(result, Is.is(4));
  }
}
