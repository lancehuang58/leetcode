package array;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import array.RunningSum.Solution;

import org.assertj.core.api.Assertions;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
public class RunningSumTest {

    @Test
    void test_exection() {
        Solution solution = new Solution();
        int[] ints = solution.runningSum(new int[] { 1, 2, 3, 4 });
        Assertions.assertThat(ints).containsOnly(1, 3, 6, 10);
    }
}
