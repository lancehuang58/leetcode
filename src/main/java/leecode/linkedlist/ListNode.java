package leecode.linkedlist;

public class ListNode {

  int val;

  ListNode next;

  ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode next(ListNode next) {
    this.next = next;
    return this;
  }
}