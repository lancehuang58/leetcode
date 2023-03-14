package array;

public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {

        int max = 0;
        int left = 0;
        int curr = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                curr++;

            while(curr > k){
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
