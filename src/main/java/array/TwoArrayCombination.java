package array;

import java.util.List;
import java.util.ArrayList;

public class TwoArrayCombination {

    public List<Integer> combine(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                list.add(arr1[i]);
                i++;
            } else {
                list.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            list.add(arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            list.add(arr2[j]);
            j++;
        }

        return list;
    }
}
