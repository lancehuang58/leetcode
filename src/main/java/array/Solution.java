package array;

import java.util.Arrays;

public class Solution {

    public int[] runningSum(int[] nums) {
        int[] newNums = new int[nums.length];
        newNums[0] = nums[0];
        for (int x = 1; x < nums.length; x++) {
            newNums[x] = nums[x] + newNums[x - 1];
        }
        return newNums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }
}
