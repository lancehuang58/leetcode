package leecode.arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.IntStream;

public class SingleNumber {

  static Function<Integer[], Integer> bitmapSolution =
      nums -> {
        int result = 0;
        for (int value : nums) {
          result ^= value;
        }
        return result;
      };

  static Function<Integer[], Integer> mapSolution =
      nums -> {
        Map<Integer, Integer> cache = new HashMap<>();

        for (Integer num : nums) {
          cache.merge(num, 1, Integer::sum);
        }

        for (Entry<Integer, Integer> entry : cache.entrySet()) {
          if (entry.getValue() == 1) {
            return entry.getKey();
          }
        }
        return 0;
      };

  public static void main(String[] args) {

    int[] INTEGER_ARRAY1 = {2, 2, 5, 3, 3, 4, 4};
    int[] INTEGER_ARRAY2 = {4, 1, 2, 1, 2};

    Integer result =
        bitmapSolution.apply(IntStream.of(INTEGER_ARRAY1).boxed().toArray(Integer[]::new));

    System.out.println("result = " + result);

    Integer mapResult =
        mapSolution.apply(IntStream.of(INTEGER_ARRAY2).boxed().toArray(Integer[]::new));

    System.out.println("mapResult = " + mapResult);
  }
}
