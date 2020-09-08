package leecode.linkedlist;

public class RemoveLinkedListElement {

  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fast = dummy.next;
    ListNode slow = dummy;
    while (fast != null) {
      if (fast.val == val) {
        fast = fast.next;
        slow.next = fast;
        continue;
      }
      fast = fast.next;
      slow = slow.next;
    }

    return dummy.next;
  }
}
