package array;

public class Palindrome {

    /**
     * @param input input sting
     * @return check result
     */
    public boolean checkIfPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
