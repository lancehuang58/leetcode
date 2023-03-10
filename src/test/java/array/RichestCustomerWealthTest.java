package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RichestCustomerWealthTest {

    @Test
    void test_execution() {
        RichestCustomerWealth.Solution solution = new RichestCustomerWealth.Solution();
        int[][] account = new int[][] { { 1, 2, 3 }, { 3, 2, 1 } };
        int output = solution.maximumWealth(account);
        Assertions.assertThat(output).isEqualTo(6);
    }
}
