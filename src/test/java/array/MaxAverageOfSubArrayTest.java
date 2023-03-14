package array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxAverageOfSubArrayTest {

    MaxAverageOfSubArray solution;

    @BeforeEach
    void setUp() {
        solution = new MaxAverageOfSubArray();
    }

    @Test //[1,12,-5,-6,50,3], k = 4
    void find_max_average_value_in_sub_array() {
        double maxAverage = solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        assertThat(maxAverage).isEqualTo(12.75);
    }
}