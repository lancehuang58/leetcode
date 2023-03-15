package array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] stringList = s.split(" ");
        return Arrays.stream(stringList).map(this::reverseArray).collect(Collectors.joining(" "));
    }


    private String reverseArray(String origin) {
        char[] chars = origin.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
