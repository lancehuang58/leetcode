package array;

public class NumberOfStepToReduceANumberToZero {

    //Time Complexity: O(logN)
    //Space Complexity : O(1)
    public static class Solution {

        public int numberOfSteps(int num) {
            int countOfStep = 0;

            while (num != 0) {
                if (num % 2 == 0) {
                    num /= 2;
                    countOfStep++;
                } else {
                    num--;
                    countOfStep++;
                }
            }
            return countOfStep;
        }

        /** using bit mask. */
        public int numberOfStep2(int num) {
            int step = 0;
            while (num != 0) {
                num = (num & 1) == 0 ? num >> 1 : num - 1;
                step++;
            }
            return step;
        }
    }
}
