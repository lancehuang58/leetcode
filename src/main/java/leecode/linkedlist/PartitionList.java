package leecode.linkedlist;

import java.util.List;
import leecode.common.ListNode;

public class PartitionList {

  public ListNode partition(ListNode head, int x) {

    ListNode before = null;
    ListNode after = null;

    ListNode beforeP = new ListNode(1);
    beforeP.next = before;

    processNode(head, before, after, x);

    beforeP.next.printNode();
    System.out.println("============== = ");
    after.printNode();

    return head;
  }

  private void processNode(ListNode head, ListNode before, ListNode after, int x) {

    if (head == null) {
      return;
    }else {
      System.out.println("========== = ");
      head.printNode();
      System.out.println("========== = ");
    }

    if (head.val > x) {
      if (before == null) {
        before = new ListNode(head.val);
      } else {
        before.next = new ListNode(head.val);
      }
    } else {
      if (after == null) {
        after = new ListNode(head.val);
      } else {
        after = new ListNode(head.val);
      }
    }
    head = head.next;
    processNode(head, before, after, x);
  }
}
