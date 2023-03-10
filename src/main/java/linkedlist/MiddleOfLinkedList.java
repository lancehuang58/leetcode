package linkedlist;

public class MiddleOfLinkedList {

  /** Time Complexity O(n) Space Complexity O(1) */
  public static class Solution {

    public ListNode middleNode(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }
  }
}
