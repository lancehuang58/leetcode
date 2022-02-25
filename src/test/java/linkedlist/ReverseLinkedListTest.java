package linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

  ReverseLinkedList processor = new ReverseLinkedList();

  @Test
  void test_revers_list() {
    ListNode node = ListNode.of(1, 2, 3, 4, 5);
    ListNode listNode = processor.reverseList(node);
    Assertions.assertThat(listNode.values()).containsExactly(5, 4, 3, 2, 1);
  }
}
