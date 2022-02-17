package linkedlist;

public class ListNode {
  int val;
  ListNode next;

  public ListNode(int val) {
    this.val = val;
  }

  public int getVal() {
    return val;
  }

  public ListNode setNext(ListNode next) {
    this.next = next;
    return this;
  }

  public ListNode getNext() {
    return next;
  }

  public boolean hasNext() {
    return next != null;
  }

  public static ListNode of(Integer... values) {
    ListNode head = null;
    ListNode current = null;
    int i = 0;
    while (i < values.length) {
      if (head == null) {
        current = new ListNode(values[i]);
        head = current;
      } else {
        ListNode listNode = new ListNode(values[i]);
        current.setNext(listNode);
        current = listNode;
      }
      i++;
    }
    return head;
  }

  public void print() {
    System.out.print(val);
  }

  public void printAll() {
    print();
    if (this.hasNext()) {
      System.out.print(",");
      next.printAll();
    }
  }
}
