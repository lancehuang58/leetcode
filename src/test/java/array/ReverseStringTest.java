package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    ReverseString.Solution solution = new ReverseString.Solution();

    @Test
    void test() {
        char[] chars = "abc".toCharArray();
        solution.reverseString(chars);
        Assertions.assertThat(chars).containsExactly("cba".toCharArray());
    }

    @Test
    void test2() {
        char[] chars = "abcd".toCharArray();
        solution.reverseString(chars);
        Assertions.assertThat(chars).containsExactly("dcba".toCharArray());
    }
}