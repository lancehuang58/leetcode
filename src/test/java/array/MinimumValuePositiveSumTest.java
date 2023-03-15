package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumValuePositiveSumTest {
    MinimumValuePositiveSum solution = new MinimumValuePositiveSum();

    @Test
    void find_min_positive_number_of_step_by_step_sum() {
        int i = solution.minStartValue(new int[]{-3, 2, -3, 4, 2});
        assertThat(i).isEqualTo(5);
    }

    @Test
    void find_min_positive_number2() {
        int i = solution.minStartValue(new int[]{1, 2});
        assertThat(i).isEqualTo(1);

    }

    @Test
    void find_min_positive_number3() {
        int i = solution.minStartValue(new int[]{2, 3, 5, -5, -1});
        assertThat(i).isEqualTo(1);

    }
}