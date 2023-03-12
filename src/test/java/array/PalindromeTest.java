package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PalindromeTest {

    Palindrome p = new Palindrome();

    @Test
    void test1() {
        boolean a = p.checkIfPalindrome("aba");
        Assertions.assertThat(a).isTrue();
    }
}