package hashmap;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class RansomNote {

    /**
     * time complexity O(n)
     * space complexity O(1)
     */
    public static class Solution {

        public boolean canConstruct(String ransomNote, String magazine) {
            Map<String, Integer> map = Arrays.stream(magazine.split(""))
                    .collect(
                            groupingBy(identity(),
                                    collectingAndThen(counting(), Long::intValue)));
            String[] nodeChars = ransomNote.split("");

            for (String c : nodeChars) {
                if (!map.containsKey(c)) {
                    return false;
                }

                map.computeIfPresent(c, ((key, value) -> {
                    value--;
                    return value;
                }));

                if (map.containsValue(-1))
                    return false;
            }
            return true;
        }
    }
}
