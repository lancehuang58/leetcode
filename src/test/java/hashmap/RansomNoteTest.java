package hashmap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RansomNoteTest {

    RansomNote.Solution solution = new RansomNote.Solution();

    @Test
    void test_a_b() {
        boolean result = solution.canConstruct("a", "b");
        Assertions.assertThat(result).isFalse();
    }

    @Test
    void test_solution() {
        boolean result = solution.canConstruct("a", "abc");
        Assertions.assertThat(result).isTrue();
    }

    @Test
    void test_solution2() {
        boolean result = solution.canConstruct("aa", "abc");
        Assertions.assertThat(result).isFalse();
    }
}