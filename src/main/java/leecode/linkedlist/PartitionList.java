package leecode.linkedlist;

public class PartitionList {

  public ListNode partition(ListNode head, int x) {

    ListNode afterHead = new ListNode(0);
    ListNode after = afterHead;

    ListNode beforeHead = new ListNode(0);
    ListNode before = beforeHead;

    while (head != null) {
      if (head.val >= x) {
        after.next = head;
        after = after.next;
      } else {
        before.next = head;
        before = before.next;
      }
      head = head.next;
    }
    after.next = null;
    before.next = afterHead.next;
    return beforeHead.next;
  }
}
