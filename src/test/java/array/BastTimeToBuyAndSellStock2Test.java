package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BastTimeToBuyAndSellStock2Test {
  BastTimeToBuyAndSellStock2 solution = new BastTimeToBuyAndSellStock2();

  @Test
  void given_array_when_find_max_profit_then_return_sum_of_profit() {
    int profit = solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4});
    Assertions.assertThat(profit).isEqualTo(7);
  }

  @Test
  void given_array_when_find_max_profit_then_return_sum_of_profit_2() {
    int profit = solution.maxProfit(new int[] {1, 2, 3, 4, 5});
    Assertions.assertThat(profit).isEqualTo(4);
  }
}
