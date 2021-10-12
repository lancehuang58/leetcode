package lidemyoj;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Case2 {

  static BiFunction<Integer, Integer, String> bigger = (a, b) -> {
    if (a > b) {
      return "A";
    } else if (a < b) {
      return "B";
    } else {
      return "Equal";
    }
  };

  static BiFunction<Integer, Integer, String> smaller = (a, b) -> {
    if (a > b) {
      return "B";
    } else if (a < b) {
      return "A";
    } else {
      return "Equal";
    }
  };

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(Paths.get("src/main/resources/case2.txt"));
    final int times = parseInt(scanner.nextLine());
    for (int i = 0; i < times; i++) {
      final String gameData = scanner.nextLine();
      printGameResult(gameData.split(" "));
    }
  }



  private static void printGameResult(String[] s) {
    String compareRule = s[2];
    final int i_compare_rule = parseInt(compareRule);
    switch (i_compare_rule) {
      case 1 -> System.out.println(bigger.apply(parseInt(s[0]), parseInt(s[1])));
      case -1 -> System.out.println(smaller.apply(parseInt(s[0]), parseInt(s[1])));
    }
  }

}
