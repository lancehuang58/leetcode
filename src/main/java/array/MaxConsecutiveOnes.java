package array;

public class MaxConsecutiveOnes {
    //sliding window solution

    public int longestOnes(int[] nums, int k) {
        int ans = 0, curr = 0, left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0) {
                curr++;
            }
            while(curr > k) {
                if(nums[left] == 0) {
                    curr--;
                }

                left++;
            }
            ans = Math.max(ans, right - left +1);
        }
        return ans;
    }

    public int longestOnes2(int[] nums, int k) {
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            // If we included a zero in the window we reduce the value of k.
            // Since k is the maximum zeros allowed in a window.
            if (nums[right] == 0) {
                k--;
            }
            // A negative k denotes we have consumed all allowed flips and window has
            // more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
            if (k < 0) {
                // If the left element to be thrown out is zero we increase k.
                k = k + (1 - nums[left]);
                left++;
            }
        }
        return right - left;
    }
}
