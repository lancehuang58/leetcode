package string;

public class StringToInteger {
  public int myAtoi(String s) {

    if (s != null) {
      s = s.trim();
    }

    if (s == null || s.length() < 1) {
      return 0;
    }

    int i = 0;
    char flag;
    if (s.charAt(0) == '-') {
      flag = '-';
      i++;
    } else if (s.charAt(0) == '+') {
      flag = '+';
      i++;
    } else {
      flag = '+';
    }

    double result = 0;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      result = result * 10 + Character.getNumericValue(s.charAt(i));
      i++;
    }

    if (flag == '-') {
      result = -result;
    }

    if (result > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    if (result < Integer.MIN_VALUE) {
      return Integer.MIN_VALUE;
    }

    return (int) result;
  }
}
