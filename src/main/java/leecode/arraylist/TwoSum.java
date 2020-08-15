package leecode.arraylist;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  static Integer[] INTEGER_ARRAY = {2, 3, 4, 7};

  public static void main(String[] args) {

    int target = 11;

    Map<Integer, Integer> cacheIndexMap = new HashMap<>();

    for (int index = 0; index < INTEGER_ARRAY.length; index++) {
      int current = INTEGER_ARRAY[index];
      int complement = target - current;

      if (cacheIndexMap.containsKey(complement)) {
        System.out.println(String.format("array[%d]=%d ", index, current));
        System.out
            .println(String.format("array[%d]=%d ", cacheIndexMap.get(complement), complement));
      }
      cacheIndexMap.put(current, index);
    }


  }

}
