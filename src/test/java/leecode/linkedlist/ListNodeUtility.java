package leecode.linkedlist;

public class ListNodeUtility {
  public static ListNode last(ListNode t) {

    while (t.next != null) {
      t = t.next;
    }
    return t;
  }

  public static ListNode reverse(ListNode node) {
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
