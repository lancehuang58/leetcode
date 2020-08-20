package leecode.linkedlist;

import leecode.common.ListNode;

public class RemoveLinkedListElements {

  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return head;
    }

    ListNode firstPointer = head.next;
    ListNode secondiPointer = head;

    if (head.val == val) {
      head = head.next;
    }

    while (firstPointer != null) {
      if (firstPointer.val == val) {
        secondiPointer.next = firstPointer.next;
      }
      firstPointer = firstPointer.next;
      secondiPointer = secondiPointer.next;
    }

    return head;
  }
}
