package array;

public class RemoveDuplicateNumbersFromSortedArray {

  public int execute(int[] numbers) {
    if (numbers.length == 0) return 0;
    int x = 0;
    for (int j = 1; j < numbers.length; j++) {
      if (numbers[x] != numbers[j]) {
        x++;
        numbers[x] = numbers[j];
      }
    }
    return x + 1;
  }
}
