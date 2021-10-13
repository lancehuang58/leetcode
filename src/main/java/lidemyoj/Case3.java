package lidemyoj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Case3 {

  public static void main(String[] args) {
    findRelativeNumber();
  }

  public static void findRelativeNumber() {

    for (int i = 1; i < 100; i++) {
      findMatchNumber(i);
    }
  }

  private static void findMatchNumber(int i) {
    final int j = findSumOfFactors(i);
    final int k = findSumOfFactors(j);
    if (j == k) {
      System.out.printf("sum of factor of i %d = %d \n", i, j);
      System.out.printf("sum of factory of j %d  = %d\n", j, k);
      System.out.printf("i %d and k %d is relative numbers \n", i, k);
      System.out.println("#####################");
    }
  }

  private static int findSumOfFactors(int n) {

    List<Integer> factors = new ArrayList<>();
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        factors.add(i);
      }
    }
    return factors.stream().mapToInt(Integer::intValue).sum();
  }
}
