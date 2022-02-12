package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayReverseTest {

    ArrayReverse<Integer> processor = new ArrayReverse<>();

    @Test
    void test_reverse_array(){
        Integer[] array = new Integer[]{1,2,3,4,5};
        Assertions.assertThat(processor.reverse(array)).containsExactlyInAnyOrder(5,4,3,2,1);
    }
}
