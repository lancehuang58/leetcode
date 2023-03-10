package array;

public class NumberOfStepToReduceANumberToZero {

    public static class Solution {

        public int numberOfSteps(final int num) {
            int change = num;
            int count = 0;

            while (change != 0) {
                if (change % 2 == 0) {
                    change /= 2;
                    count++;
                }

                if (change % 2 != 0) {
                    change--;
                    count++;
                }
            }
            return count;
        }
    }
}
