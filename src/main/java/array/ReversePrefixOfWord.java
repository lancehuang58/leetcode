package array;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int left = 0;
        for (int right = 1; right < chars.length; right++) {
            if (chars[right] == ch) {
                while (left < right) {
                    char tmp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = tmp;
                    left++;
                    right--;
                }
                break;
            }
        }
        return new String(chars);
    }
}
