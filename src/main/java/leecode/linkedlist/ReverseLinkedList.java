package leecode.linkedlist;

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
