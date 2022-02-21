package linkedlist;

import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndTest {
  RemoveNthNodeFromEnd processor = new RemoveNthNodeFromEnd();

  @Test
  void test_remove_nth_node_from_end() {
    ListNode head = ListNode.of(1, 2, 3, 4, 5);
    processor.removeNthNodeFromEnd(head, 2);
  }

  @Test
  void test_remove_nth_node_from_end_case_2() {
    ListNode head = ListNode.of(1);
    processor.removeNthNodeFromEnd(head, 1);
  }
}
