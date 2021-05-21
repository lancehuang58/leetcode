package leecode.arraylist;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

  @Test
  public void given_array_and_find_single_number() {
    int[] INTEGER_ARRAY1 = {2, 2, 5, 3, 3, 4, 4};
    Integer result =
        SingleNumber.bitmapSolution.apply(
            IntStream.of(INTEGER_ARRAY1).boxed().toArray(Integer[]::new));
    assertThat(result).isEqualTo(5);
  }

  @Test
  public void given_array_and_find_single_number2() {
    int[] INTEGER_ARRAY2 = {4, 1, 2, 1, 2};
    Integer mapResult =
        SingleNumber.mapSolution.apply(
            IntStream.of(INTEGER_ARRAY2).boxed().toArray(Integer[]::new));
    assertThat(mapResult).isEqualTo(4);
  }
}
