package string;

public class ReverseString {

  public void reverseString(char[] chars) {
    for (int i = 0; i < chars.length / 2; i++) {
      char temp = chars[i];
      chars[i] = chars[chars.length - i - 1];
      chars[chars.length - i - 1] = temp;
    }
  }
}
