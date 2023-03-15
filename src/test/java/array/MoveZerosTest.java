package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZerosTest {

    /**
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */
    @Test
    void test_move_zeros_to_tail() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new MoveZeros().moveZeroes(nums);
        assertThat(nums).containsExactly(1, 3, 12, 0, 0);
    }
}