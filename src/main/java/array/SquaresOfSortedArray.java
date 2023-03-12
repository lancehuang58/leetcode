package array;

public class SquaresOfSortedArray {


    static class Solution {

        public int[] sortedSquares(int[] nums) {
            int[] result = new int[nums.length];
            int leftIdx = 0;
            int rightIdx = nums.length - 1;
            for (int x = result.length - 1; x >= 0; x--) {
                if (Math.abs(nums[leftIdx]) > Math.abs(nums[rightIdx])) {
                    result[x] = nums[leftIdx] * nums[leftIdx];
                    leftIdx++;
                } else {
                    result[x] = nums[rightIdx] * nums[rightIdx];
                    rightIdx--;
                }
            }
            return result;
        }

    }
}
