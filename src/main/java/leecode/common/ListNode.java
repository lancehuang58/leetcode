package leecode.common;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfInt;
import java.util.StringJoiner;

public class ListNode {

  public int val;

  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode next(ListNode node) {
    this.next = node;
    return this;
  }

  public ListNode last() {
    ListNode t = this;
    while (t.next != null) {
      t = t.next;
    }
    return t;
  }

  public String toArrayString() {
    ListNode t = this;
    StringJoiner joiner = new StringJoiner(",\t");

    joiner.add(String.valueOf(t.val));

    while (t.next != null) {
      joiner.add(String.valueOf(t.next.val));
      t = t.next;
    }
    return joiner.toString();
  }

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
