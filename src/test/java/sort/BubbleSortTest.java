package sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    BubbleSort sort = new BubbleSort();

    @Test
    void test_sort() {

        int[] nums = new int[] { 6, 5, 9, 7, 2, 8 };

        sort.execute(nums);

        Assertions.assertThat(nums).containsExactly(new int[] { 2, 5, 6, 7, 8, 9 });

    }

}
