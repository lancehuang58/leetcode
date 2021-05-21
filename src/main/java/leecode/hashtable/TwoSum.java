package leecode.hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  static TwoSumStrategy STRATEGY_MAPPING = (numbers, targetNumber) -> {
    Map<Integer, Integer> cache = new HashMap<>();
    for (int i = 0; i < numbers.length; i++) {
      cache.put(numbers[i], i);
    }

    for (int i = 0; i < numbers.length; i++) {
      final int currentValue = numbers[i];
      int valueNeedToFind = targetNumber - currentValue;
      if (cache.containsKey(valueNeedToFind)) {
        return new int[]{i, cache.get(valueNeedToFind)};
      }
    }
    throw new RuntimeException("can't find match value");
  };

  static TwoSumStrategy STRATEGY_SIMPLE = (nums, target) -> {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        int valueNeedToFind = target - nums[i];
        if (nums[j] == valueNeedToFind) {
          return new int[]{i, j};
        }
      }
    }
    throw new RuntimeException("can't find match value");
  };

  static TwoSumStrategy STRATEGY_TWO_POINTER = (numbers, targetNumber) -> {
    int head = 0;
    int rear = numbers.length - 1;
    int sum;
    do {
      sum = numbers[head] + numbers[rear];
      if (sum > targetNumber) {
        rear--;
        if (rear == 0) {
          throw new RuntimeException("can't find target index");
        }
      } else if (sum < targetNumber) {
        head++;
        if (head == numbers.length - 1) {
          throw new RuntimeException("can't find target index");
        }
      } else {
        return new int[]{head, rear};
      }
    } while (head<rear);
    throw new RuntimeException("can't find target index");
  };

  public int[] mapSolution(int[] nums, int target) {
    return STRATEGY_MAPPING.findTwoSum(nums, target);
  }

  public int[] violenceSolution(int[] nums, int target) {
    return STRATEGY_SIMPLE.findTwoSum(nums, target);
  }

  public int[] twoPointerSolution(int[] nums, int target) {
    return STRATEGY_TWO_POINTER.findTwoSum(nums, target);
  }

  interface TwoSumStrategy {
    int[] findTwoSum(int[] numbers, int targetNumber);
  }
}
