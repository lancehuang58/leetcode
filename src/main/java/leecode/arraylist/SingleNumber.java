package leecode.arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {

  public static void main(String[] args) {

    int[] INTEGER_ARRAY1 = {2, 2, 5, 3, 3, 4, 4};
    int[] INTEGER_ARRAY2 = {4, 1, 2, 1, 2};

    Solution solution = new Solution2();
    int i = solution.singleNumber(INTEGER_ARRAY1);
    System.out.println("i = " + i);
  }
}

abstract class Solution {

  abstract int singleNumber(int[] nums);
}

class Solution1 extends Solution {

  @Override
  int singleNumber(int[] nums) {
    {
      int result = 0;
      for (int value : nums) {
        result ^= value;
      }
      return result;
    }
  }
}

class Solution2 extends Solution {

  @Override
  int singleNumber(int[] nums) {
    Map<Integer, Integer> cache = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      cache.merge(nums[i], 1, Integer::sum);
    }
    Iterator<Entry<Integer, Integer>> iterator = cache.entrySet().iterator();
    while (iterator.hasNext()) {
      Entry<Integer, Integer> entry = iterator.next();
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }
    return 0;
  }
}
