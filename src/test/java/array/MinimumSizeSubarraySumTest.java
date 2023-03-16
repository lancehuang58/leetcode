package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumSizeSubarraySumTest {
    MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

    @Test
    void test_find() {
        int result = solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        assertThat(result).isEqualTo(2);

    }
}