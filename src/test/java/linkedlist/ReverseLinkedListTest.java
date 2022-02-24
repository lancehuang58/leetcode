package linkedlist;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  ReverseLinkedList processor = new ReverseLinkedList();

  @Test
  void test_revers_list() {
    ListNode node = ListNode.of(1, 2, 3, 4, 5);
    ListNode listNode = processor.reverseList(node);
    // listNode.print();
  }
}
