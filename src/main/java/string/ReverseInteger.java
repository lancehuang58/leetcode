package string;

public class ReverseInteger {

  public int reverse(int x) {
    int result = 0;
    while (x != 0) {
      int m = x % 10;
      int newResult = result * 10 + m;
      if ((newResult - m) / 10 != result) {
        return 0;
      }
      result = newResult;
      x = x / 10;
    }
    return result;
  }
}
