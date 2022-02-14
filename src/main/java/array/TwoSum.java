package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    Map<Integer, Integer> mapping = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (mapping.containsKey(target - nums[i])) {
        res[0] = mapping.get(target - nums[i]);
        res[1] = i;
      }else{
        mapping.put(nums[i], i);
      }
    }
    return res;
  }
}
