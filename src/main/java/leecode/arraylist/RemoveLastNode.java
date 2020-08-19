package leecode.arraylist;

import leecode.common.ListNode;

public class RemoveLastNode {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);
    node1.next(node2);
    node2.next(node3);
    node3.next(node4);
    node4.next(node5);

    printListNode(node1);

    Solution solution = new Solution();
    ListNode dummy = new ListNode(520);
    dummy.next(node1);

    ListNode listNode = solution.removeNthFromEnd(dummy, 2);
    printListNode(listNode);

  }

  private static void printListNode(ListNode listNode) {
    if (listNode.next != null) {
      printListNode(listNode.next);
    }
  }

  private static class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode fast = head;
      ListNode slow = head;

      for (int i = 0; i < n; i++) {
        fast = fast.next;
      }

      while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
      }

      slow.next = (slow.next.next);

      return head;
    }
  }
}
