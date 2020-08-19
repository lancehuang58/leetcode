package leecode.common;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfInt;

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

  public void printNode() {
    printNode(this);
    System.out.println("=========== ");
  }

  private void printNode(ListNode node) {
    System.out.println("node.val = " + node.val);
    if (node.next != null) {
      printNode(node.next);
    }
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
