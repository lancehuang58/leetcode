package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumOfArrayTest {

    SumOfArray p = new SumOfArray();

    @Test
    void test() {
        int[] result = p.runningSum(new int[]{1, 1, 1, 1, 1});
        assertThat(result).containsExactly(1, 2, 3, 4, 5);
    }
    @Test
    void test2() {
        int[] result = p.runningSum(new int[]{1, 2,3,4});
        assertThat(result).containsExactly(1, 3,6, 10);
    }
}