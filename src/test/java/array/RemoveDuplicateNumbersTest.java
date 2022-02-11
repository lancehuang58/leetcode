package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicateNumbersTest {
    RemoveDuplicates processor = new RemoveDuplicates();

    @Test
    void give_empty_array_when_process_then_return_0() {
        Assertions.assertThat(processor.execute(new int[] {})).isZero();
    }

    // @Test
    // void given_array_when_find_max_number_location_then_return_2() {
    // Assertions.assertThat(processor.execute(new int[] { 1, 2 })).isEqualTo(2);
    // }

    // @Test
    // void givne_array_when_find_max_location_then_return_2() {
    // Assertions.assertThat(processor.execute(new int[] { 1, 2, 2 })).isEqualTo(2);
    // }

    // @Test
    // void given_array_6_when_find_max_location_the_return_3() {
    // Assertions.assertThat(processor.execute(new int[] { 1, 1, 2, 2, 3, 3
    // })).isEqualTo(3);
    // }
}
