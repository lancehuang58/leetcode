package sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
  MergeSortedArray solution = new MergeSortedArray();

  @Test
  void merge() {
    int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
    solution.merge(nums1, 3, new int[] {2, 5, 6}, 3);
    System.out.println(Arrays.toString(nums1));
  }
}
