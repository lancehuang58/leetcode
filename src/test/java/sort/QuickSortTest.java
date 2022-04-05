package sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest {
    @Test
    void test_sort() {
        QuickSort p = new QuickSort();
        int[] qsort = p.qsort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
        Assertions.assertThat(qsort).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}