package array;

public class RichestCustomerWealth {

    public static class Solution {

        public int maximumWealth(int[][] account) {
            int max = 0;
            for (int x = 0; x < account.length; x++) {
                int sumOfUserAccount = 0;
                for (int j = 0; j < account[x].length; j++) {
                    sumOfUserAccount += account[x][j];
                }
                max = Math.max(max, sumOfUserAccount);
            }
            return max;
        }
    }

}
