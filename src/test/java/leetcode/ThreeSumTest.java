package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Leetcode 15
 */
class ThreeSumTest {

    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

    @Test
    public void test_find_three_sum_zero() {
        Set<List<Integer>> zeroSum = ThreeSum.findZeroSum(nums);
        assertThat(zeroSum).anyMatch(p -> p.equals(List.of(-1, 0, 1)));
        assertThat(zeroSum).anyMatch(p -> p.equals(List.of(-1, -1, 2)));
    }
}