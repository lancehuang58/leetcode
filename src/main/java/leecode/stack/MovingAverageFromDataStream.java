package leecode.stack;

import java.util.LinkedList;
import java.util.OptionalDouble;

public class MovingAverageFromDataStream {

  LinkedList<Integer> linkedList;
  int slidingWindowSize;

  public MovingAverageFromDataStream(int size) {
    linkedList = new LinkedList<>();
    this.slidingWindowSize = size;
  }

  public double next(int x) {
    if (linkedList.size() < slidingWindowSize) {
      linkedList.offer(x);
    } else {
      linkedList.removeFirst();
      linkedList.add(x);
    }

    OptionalDouble average = linkedList.stream().mapToInt(k -> k).average();
    return average.getAsDouble();
  }
}
