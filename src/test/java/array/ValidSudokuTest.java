package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidSudokuTest {
  String[][] board =
      new String[][] {
        {"5", "3", ".", ".", "7", ".", ".", ".", "."},
        {"6", ".", ".", "1", "9", "5", ".", ".", "."},
        {".", "9", "8", ".", ".", ".", ".", "6", "."},
        {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
        {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
        {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
        {".", "6", ".", ".", ".", ".", "2", "8", "."},
        {".", ".", ".", "4", "1", "9", ".", ".", "5"},
        {".", ".", ".", ".", "8", ".", ".", "7", "9"}
      };

  ValidSudoku processor = new ValidSudoku();

  @Test
  void test_valid() {
    boolean result = processor.isValid(board);
    Assertions.assertThat(result).isTrue();
  }
}
