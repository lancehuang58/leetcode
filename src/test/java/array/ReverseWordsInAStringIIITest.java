package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {
    ReverseWordsInAStringIII solution = new ReverseWordsInAStringIII();

    /**
     * Input: s = "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     */
    @Test
    void test() {
        String result = solution.reverseWords("Let's take LeetCode contest");
        assertThat(result).isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }
}