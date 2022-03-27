package sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {

  private int[] nums;

  @Test
  void test_selection_sort() {
    SelectionSort selectionSort = new SelectionSort();
    nums = new int[] {5, 3, 2, 7, 1};
    selectionSort.sort(nums);
    assertThat(nums).containsExactly(1, 2, 3, 5, 7);
  }
}
