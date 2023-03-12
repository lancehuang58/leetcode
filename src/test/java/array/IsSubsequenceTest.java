package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class IsSubsequenceTest {

    IsSubsequence.Solution solution = new IsSubsequence.Solution();

    @Test
    void test() {
        boolean subsequence = solution.isSubsequence("abc", "ahbgdc");
        Assertions.assertThat(subsequence).isTrue();
    }
}