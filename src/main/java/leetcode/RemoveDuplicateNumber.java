package leetcode;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicateNumber {

  public int removeDuplicates(int[] numbers) {

    if (null == numbers || numbers.length == 0) {
      return 0;
    }

    List<Integer> list = new LinkedList<>();
    for (int i = 0; i < numbers.length; i++) {
      int k = i - 1;
      if (k < 0 || numbers[k] != numbers[i]) {
        list.add(numbers[i]);
      }
    }
    return list.size();
  }

}
