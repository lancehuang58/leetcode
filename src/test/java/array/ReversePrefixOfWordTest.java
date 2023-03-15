package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversePrefixOfWordTest {
    /**
     * Input: word = "abcdefd", ch = "d"
     * Output: "dcbaefd"
     */
    @Test
    void test() {
        ReversePrefixOfWord solution = new ReversePrefixOfWord();
        String s = solution.reversePrefix("abcdefd", 'd');
        assertThat(s).isEqualTo("dcbaefd");
    }
}