package basic;

import java.util.Arrays;

public class SumByRecursive {

    public int sum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int[] restOfArray = Arrays.copyOfRange(nums, 1, nums.length);
            return nums[0] + sum(restOfArray);
        }
    }

    public static void main(String[] args) {
        SumByRecursive p = new SumByRecursive();
        System.out.println(p.sum(new int[]{1, 2, 3}));
    }
}
