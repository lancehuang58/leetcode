package sort;

import java.util.Arrays;

public class QuickSort {

    public int[] qsort(int[] nums) {
        if (nums.length < 2) {
            return nums;
        } else {
            int pivot = nums[0];
            int[] front = Arrays.stream(nums).filter(e -> e < pivot).toArray();
            int[] end = Arrays.stream(nums).filter(value -> value > pivot).toArray();
            return merge(qsort(front), new int[]{pivot}, qsort(end));
        }
    }


    public int[] merge(final int[]... arrays) {
        int size = 0;
        for (int[] a : arrays)
            size += a.length;

        int[] res = new int[size];

        int destPos = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (i > 0) destPos += arrays[i - 1].length;
            int length = arrays[i].length;
            System.arraycopy(arrays[i], 0, res, destPos, length);
        }

        return res;
    }
}
