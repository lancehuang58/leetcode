package array;

import java.util.*;

public class ValidSudoku {

  public boolean isValid(String[][] board) {

    Map<Integer, List<String>> map = new HashMap<>();

    for (int i = 0; i < 9; i++) {
      // row
      String[] row = board[i];
      if (isDuplicate(row)) {
        return false;
      }

      // column
      String[] col = new String[9];
      for (int j = 0; j < 9; j++) {
        col[j] = board[j][i];
        int sectionId = (i / 3) * 3 + (j / 3);
        if (!map.containsKey(sectionId)) {
          ArrayList<String> section = new ArrayList<>();
          section.add(board[i][j]);
          map.put(sectionId, section);
        } else {
          map.get(sectionId).add(board[i][j]);
        }
      }

      if (isDuplicate(col)) {
        return false;
      }
    }
    for (Map.Entry<Integer, List<String>> next : map.entrySet()) {
      String[] strings = next.getValue().toArray(new String[0]);
      if (isDuplicate(strings)) {
        return false;
      }
    }

    return true;
  }

  private boolean isDuplicate(String[] array) {
    Set<String> set = new HashSet<>();
    for (String s : array) {
      if (s.equals(".")) continue;
      if (!set.contains(s)) {
        set.add(s);
      } else {
        return true;
      }
    }
    return false;
  }
}
