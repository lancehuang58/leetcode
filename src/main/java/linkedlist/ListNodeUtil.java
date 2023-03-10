package linkedlist;

public class ListNodeUtil {

  static ListNode build(int[] array) {
    ListNode head = null;
    for (int i = array.length - 1; i >= 0; i--) {
      head = (head != null) ? new ListNode(array[i], head) : new ListNode(array[i]);
    }
    return head;
  }

  static void print(ListNode head) {

    if (head != null) {
      String format = head.next == null ? " %d " : " %d -> ";
      System.out.printf(format, head.val);
    }

    if (head != null && head.next != null) {
      print(head.next);
    }
    System.out.println();
  }
}
