package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    @Test
    void longestOnes() {
        int i = solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);
        assertThat(i).isEqualTo(6);
    }
}