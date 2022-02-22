package linkedlist;

public class HasCycle {
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    ListNode fast = head.next;
    ListNode slow = head;
    while (slow != fast) {

      if (fast.next == null || fast.next.next == null) {
        return false;
      }

      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
}
