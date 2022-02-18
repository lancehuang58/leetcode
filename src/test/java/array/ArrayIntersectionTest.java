package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIntersectionTest {

    ArrayIntersection processor = new ArrayIntersection();

    @Test
    void test_array_intersection() {
        int[] result = processor.getInterSection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
        Assertions.assertThat(result).containsExactlyInAnyOrder(2, 2);
    }

    @Test
    void test_array_intersction_2() {
        int[] result = processor.getInterSection(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
        Assertions.assertThat(result).containsExactlyInAnyOrder(9, 4);
    }

    @Test
    void test_array_intersction_3() {
        int[] result = processor.getInterSection(new int[] { 3, 1, 2 }, new int[] { 1, 1 });
        Assertions.assertThat(result).containsExactlyInAnyOrder(1);
    }

}
