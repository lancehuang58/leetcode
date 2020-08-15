package leecode.arraylist;

public class MaximumDistanceInArrays {

  //  static Function<Integer[], Integer> firstElement = array -> array[0];
  //  static Function<Integer[], Integer> lastElement = array -> array[array.length-1z]

  public int maxDistance(int[][] array1) {
    int start = firstElement(array1[0]);
    int end = lastElement(array1[0]);
    int max = 0;

    for (int i = 1; i < array1.length; i++) {
      max = Math.max(max, Math.abs(start - lastElement(array1[i])));
      max = Math.max(max, Math.abs(end - firstElement(array1[i])));
      start = firstElement(array1[i]);
      end = lastElement(array1[i]);
    }
    return max;
  }

  private static int lastElement(int[] array) {
    return array[array.length - 1];
  }

  private static int firstElement(int[] array) {
    return array[0];
  }
}
