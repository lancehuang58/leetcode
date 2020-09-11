package leecode.linkedlist.medium;

import leecode.linkedlist.ListNode;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode reference;
    ListNode head = new ListNode();
    reference = head;

    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {

      int sum = 0;

      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;
      int value = sum % 10;
      carry = sum / 10;
      head.next = new ListNode(value);
      head = head.next;
    }

    return reference.next;
  }
}
