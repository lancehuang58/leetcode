package leecode.arraylist;

public class FindInMatrix {
  /**
   *
   * @param matrix
   * @param targetNumber
   * @return
   */
  public static boolean find(int[][] matrix, int targetNumber) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return false;
    }
    int countOfRows = matrix.length;
    int countOfColumns = matrix[0].length;
    int r = 0, c = countOfColumns - 1;
    while (r <= countOfRows && c >= 0) {
      if (matrix[r][c] == targetNumber) {
        return true;
      } else if (targetNumber > matrix[r][c]) {
        r++;
      } else {
        c--;
      }
    }
    return false;
  }
}
