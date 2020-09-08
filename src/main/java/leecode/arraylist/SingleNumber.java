package leecode.arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class SingleNumber {

  public static Function<Integer[], Integer> bitmapSolution =
      nums -> {
        int result = 0;
        for (int value : nums) {
          result ^= value;
        }
        return result;
      };

  public static Function<Integer[], Integer> mapSolution =
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
}
