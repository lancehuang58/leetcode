package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SquaresOfSortedArrayTest {
    SquaresOfSortedArray.Solution solution = new SquaresOfSortedArray.Solution();

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     */
    @Test
    void test_case_2() {
        int[] r = solution.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        Assertions.assertThat(r).containsExactly(0, 1, 9, 16, 100);
    }


    @Test
    void test_case_1() {
        int[] r = solution.sortedSquares(new int[]{-5, -3 , -2, -1});
        Assertions.assertThat(r).containsExactly(1,4, 9, 25);
    }

}