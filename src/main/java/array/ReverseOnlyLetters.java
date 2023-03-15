package array;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            }

            if (!Character.isLetter(chars[right])) {
                right--;
            }

            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

        }
        return new String(chars);
    }
}
