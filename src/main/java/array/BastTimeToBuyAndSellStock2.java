package array;

import java.util.logging.Logger;

public class BastTimeToBuyAndSellStock2 {

  Logger logger = Logger.getLogger("BastTimeToBuyAndSellStock2");

  public int maxProfit(int[] prices) {
    int benefit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] - prices[i-1] > 0) {
        benefit += prices[i] - prices[i-1];
      }
    }
    return benefit;
  }
}
