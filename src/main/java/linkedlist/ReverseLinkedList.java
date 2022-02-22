package linkedlist;

public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    // declare nodes previous/current/next
    ListNode current = head;
    ListNode previous = null;
    ListNode next;
    while (current != null) {
      //1.get next cached
      next = current.next;
      //2 current node.next = previous
      current.next = previous;
      //previous node as current node
      previous = current;
      //move current to next node
      current = next;
    }
    //set the head node as last node
    head = previous;
    return head;
  }
}
