package linkedlist;

import java.util.*;
import java.util.logging.Logger;

public class ListNode {
  int val;
  ListNode next;
  Logger logger = Logger.getLogger(getClass().getSimpleName());

  public ListNode(int val) {
    this.val = val;
  }

  public static ListNode of(Integer... values) {
    ListNode head = null;
    ListNode current = null;
    int i = 0;
    while (i < values.length) {
      if (head == null) {
        current = new ListNode(values[i]);
        head = current;
      } else {
        ListNode listNode = new ListNode(values[i]);
        current.next = listNode;
        current = listNode;
      }
      i++;
    }
    return head;
  }

  public void print() {

    logger.info(Arrays.toString(values()));
  }

  public int[] values() {
    List<Integer> list = new ArrayList<>();
    ListNode current = this;

    while (current != null) {
      list.add(current.val);
      current = current.next;
    }
    return list.stream().mapToInt(i -> i).toArray();
  }
}
