package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

  public boolean isPalindrome(ListNode head) {
    int[] normal = getIntArray(head);
    int[] reverse = getIntArray(reverse(head));
    for (int i = 0; i < normal.length; i++) {
      if (normal[i] != reverse[i]) {
        return false;
      }
    }
    return true;
  }

  private int[] getIntArray(ListNode head) {
    ListNode current = head;
    List<Integer> list = new ArrayList<>();
    while (current != null) {
      list.add(current.val);
      current = current.next;
    }
    return list.stream().mapToInt(c -> c).toArray();
  }

  private ListNode reverse(ListNode node) {
    ListNode pre = null;
    ListNode current = node;
    ListNode next;

    while (current != null) {
      next = current.next;
      current.next = pre;
      pre = current;
      current = next;
    }
    node = pre;

    return node;
  }
}
