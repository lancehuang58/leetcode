package leecode.linkedlist;

import leecode.common.ListNode;

public class ReverseLinkedList {






  public ListNode reverseList(ListNode head) {

    ListNode temp;
    ListNode previous = null;

    while (head != null) {
      temp = head.next;
      head.next = previous;
      previous = head;
      head = temp;
    }

    return previous;
  }

}
