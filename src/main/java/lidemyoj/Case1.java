package lidemyoj;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Case1 {

  public static void main(String[] args) throws IOException {
    final Path path = Paths.get("src/main/resources/case1.txt");
    Scanner scanner = new Scanner(path);
    StringBuilder raw = new StringBuilder();
    int areaSize = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < areaSize; i++) {
      raw.append(scanner.nextLine());
    }

    int indexes = Integer.parseInt(scanner.nextLine());
    StringBuilder sb2 = new StringBuilder();
    for (int i = 0; i < indexes; i++) {
      int index = Integer.parseInt(scanner.nextLine());
      sb2.append(raw.toString().charAt(index - 1));
    }
    System.out.println(sb2);
  }
}
