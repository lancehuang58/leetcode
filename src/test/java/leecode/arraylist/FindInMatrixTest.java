package leecode.arraylist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindInMatrixTest {

  @Test
  void findInMatrix() {
    assertThat(FindInMatrix.find(null, 1)).isFalse();
    assertThat(FindInMatrix.find(new int[][] {}, 1)).isFalse();
  }

  @Test
  void find_in_matrix_provide_5_return_true() {
    int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 7, 8, 9}};
    assertThat(FindInMatrix.find(matrix, 1)).isTrue();
    assertThat(FindInMatrix.find(matrix, 9)).isTrue();
  }
}

