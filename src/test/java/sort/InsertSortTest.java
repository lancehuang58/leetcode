package sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InsertSortTest {
    @Test
    void test_insert_sort() {
        int[] a = new int[]{6, 4, 9, 8, 3};
        InsertionSort.sort(a);
        assertThat(a).containsExactly(3, 4, 6, 8, 9);
    }
}
