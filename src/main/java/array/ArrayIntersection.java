package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class ArrayIntersection {

    public int[] getIntersction(int[] num1, int[] num2) {
        int[] store = num1.length > num2.length ? num1 : num2;
        int[] array = num1.length > num2.length ? num2 : num1;

        Map<Integer, Integer> map = Arrays.stream(store).boxed()
                .collect(groupingBy(Function.identity(),
                        collectingAndThen(counting(), Long::intValue)));

        LinkedList<Integer> queue = new LinkedList<>();

        Arrays.stream(array)
                .forEach(e -> {
                    if (map.containsKey(e) && map.get(e) > 0) {
                        queue.push(e);
                        map.computeIfPresent(e, (k, v) -> v = v - 1);
                    }
                });

        return queue.stream().mapToInt(i -> i).toArray();
    }
}
