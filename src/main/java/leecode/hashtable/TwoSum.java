package leecode.hashtable;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {

  BiFunction<List<Integer>, Integer, List<Integer>> simple = (nums, target) -> {
    for (int i = 0; i < nums.size(); i++) {
      for (int j = i + 1; j < nums.size(); j++) {
        int valueNeedToFind = target - nums.get(i);
        if (nums.get(j) == valueNeedToFind) {
          return Arrays.asList(i, j);
        }
      }
    }
    return null;
  };

  public int[] twoSum(int[] nums, int target) {
    List<Integer> result = simple
        .apply(IntStream.of(nums).boxed().collect(Collectors.toList()), target);
    if (result == null) {
      return null;
    }
    int[] array = result.stream().mapToInt(i -> i).toArray();
    return array;
  }
}
