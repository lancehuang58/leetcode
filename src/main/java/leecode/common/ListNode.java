package leecode.common;


public class ListNode {

  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public ListNode next(ListNode node) {
    this.next = node;
    return this;
  }

  public void printNode() {
    printNode(this);
  }

  private void printNode(ListNode node) {
    System.out.println("node.val = " + node.val);
    if (node.next != null) {
      printNode(node.next);
    }
  }

  public static ListNode buildNode(int[] array) {

    ListNode head = new ListNode(array[0]);;
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;

    for (int i = 1; i < array.length; i++) {
      if (head.next == null) {
        head.next = new ListNode(array[i]);
        head = head.next;
      }
    }
    return dummyHead.next;
  }
}
