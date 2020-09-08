package leecode.linkedlist;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfInt;

public class ListNodeBuilder {

  public static ListNode buildNode(int[] array) {

    OfInt iterator = Arrays.stream(array).iterator();
    ListNode head = new ListNode(0);
    ListNode cap = head;
    while (iterator.hasNext()) {
      Integer i = iterator.next();
      head.next = new ListNode(i);
      head = head.next;
    }
    return cap.next;
  }
}
