package leecode.arraylist;

import lombok.extern.java.Log;

@Log
public class FindDuplicateNumber {

  public static int find(int[] array) {
    if (array.length == 0) {
      throw new RuntimeException("array can't be empty");
    }

    for (int i = 0; i < array.length; i++) {
      while (array[i] != i) {
        if (array[i] == array[array[i]]) {
          return array[i];
        }
        swap(array, i, array[i]);
      }
    }

    return -1;
  }

  private static void swap(int[] array, int i, int j) {
    log.info(() -> String.format("swap %d %d", array[i], array[j]));
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }
}
