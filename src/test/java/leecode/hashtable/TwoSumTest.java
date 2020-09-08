package leecode.hashtable;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.hamcrest.core.Is;
import org.junit.Test;

public class TwoSumTest {

  @Test
  public void twoSum() {
    TwoSum solution = new TwoSum();
    int[] intIndex = solution.twoSum(new int[] {1, 3, 4, 5, 7}, 12);
    assertThat(intIndex[0], Is.is(3));
    assertThat(intIndex[1], Is.is(4));
  }
}
