package sorting;

public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    simpleMerge(nums1, m, nums2, n);
  }

  private void simpleMerge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1, j = n - 1, k = m + n - 1;
    while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        k--;
        i--;
      } else {
        nums1[k] = nums2[j];
        k--;
        j--;
      }
    }

    while (j >= 0) {
      nums1[k] = nums2[j];
      k--;
      j--;
    }
  }

  private void bubbleSort(int[] nums1, int m, int[] nums2, int n) {
    int index = 0;
    for (int i = m; i < m + n; i++) {
      nums1[i] = nums2[index];
      index++;
    }

    for (int j = 0; j < nums1.length - 1; j++) {
      for (int k = j + 1; k < nums1.length; k++) {
        if (nums1[j] > nums1[k]) {
          int temp = nums1[j];
          nums1[j] = nums1[k];
          nums1[k] = temp;
        }
      }
    }
  }
}
