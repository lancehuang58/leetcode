package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindPivotIndexTest {

    FindPivotIndex solution = new FindPivotIndex();

    @Test
    void find_index() {
        int i = solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        assertThat(i).isEqualTo(3);
    }
}