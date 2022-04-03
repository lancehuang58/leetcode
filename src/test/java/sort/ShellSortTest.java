package sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ShellSortTest {

    @Test
    void test() {
        ShellSort processor = new ShellSort();

        int[] nums = new int[] { 8, 6, 10, 5, 3, 9, 2, 7, 4, 1 };
        processor.sort(nums);
        System.out.println(Arrays.toString(nums));

        Assertions.assertThat(nums).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}