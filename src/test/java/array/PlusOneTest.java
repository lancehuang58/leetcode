package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    void case1() {
        int[] nums = new int[] { 4, 3, 2, 1 };
        int[] result = plusOne.execute(nums);
        Assertions.assertThat(result).containsExactly(4, 3, 2, 2);
    }

  @Test
  void case2() {
      int[] nums = new int[] {9};
      int[] result = plusOne.execute(nums);
      Assertions.assertThat(result).containsExactly(1,0);
  }

    @Test
    void case3() {
        int[] nums = new int[] {1,2,3};
        int[] result = plusOne.execute(nums);
        Assertions.assertThat(result).containsExactly(1,2,4);
    }

    @Test
    void case4() {
        int[] nums = new int[] {9,8,7,6,5,4,3,2,1,0};
        int[] result = plusOne.execute(nums);
        Assertions.assertThat(result).containsExactly(9,8,7,6,5,4,3,2,1,1);
    }

    @Test
    void case5() {
        int[] nums = new int[] {9,9};
        int[] result = plusOne.execute(nums);
        Assertions.assertThat(result).containsExactly(1,0,0);
    }
}
