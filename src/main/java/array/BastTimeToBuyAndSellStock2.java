package array;

public class BastTimeToBuyAndSellStock2 {

  public int maxProfit(int[] prices) {
    int benefit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] - prices[i - 1] > 0) {
        benefit += prices[i] - prices[i - 1];
      }
    }
    return benefit;
  }
}