package array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TwoArrayCombinationTest {


    TwoArrayCombination p = new TwoArrayCombination();

    @Test
    void test() {
        List<Integer> combine = p.combine(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6});
        assertThat(combine).containsExactly(1, 2, 3, 3, 4, 4, 5, 6);
    }
}