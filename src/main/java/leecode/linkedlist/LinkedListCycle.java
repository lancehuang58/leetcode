package leecode.linkedlist;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import leecode.common.ListNode;

public class LinkedListCycle {

  Function<ListNode, Boolean> hashStrategy =
      head -> {
        Set<ListNode> s = new HashSet<>();
        while (head != null && head.next != null) {
          if (s.contains(head)) {
            return true;
          }
          s.add(head);
          head = head.next;
        }
        return false;
      };

  Function<ListNode, Boolean> twoPointerStrategy =
      head -> {
        if (head == null || head.next == null) {
          return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
          if (fast == null || fast.next == null) {
            return false;
          }
          fast = fast.next.next;
          slow = slow.next;
        }
        return true;
      };

  public boolean hasCycle(ListNode head) {
    return twoPointerStrategy.apply(head);
  }
}
