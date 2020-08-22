package leecode.linkedlist;

import leecode.common.ListNode;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {

    if (head == null) return false;

    ListNode f = head;
    ListNode s = head;

    while (f != null && f.next != null) {
      f = f.next.next;
      s = s.next;
    }
    f = head;
    s = reverse(s);

    while (s != null) {
      if (s.val != s.val) {
        return false;
      }
      s = s.next;
      f = f.next;
    }

    return true;
  }

  public ListNode reverse(ListNode node) {
    ListNode temp;
    ListNode previous = null;
    while (node != null) {
      temp = node.next;
      node.next = previous;
      previous = node;
      node  = temp;
    }

    return previous;
  }
}
