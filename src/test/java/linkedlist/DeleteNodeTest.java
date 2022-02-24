package linkedlist;

import org.junit.jupiter.api.Test;

class DeleteNodeTest {
  DeleteNode processor = new DeleteNode();

  @Test
  public void test_delete_node() {
    ListNode head = ListNode.of(4, 5, 1, 9);
    // head.print();
    // System.out.println();
    ListNode node1 = head.next.next;
    processor.deleteNode(node1);
    // head.print();
  }
}
