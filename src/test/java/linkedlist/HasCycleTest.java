package linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HasCycleTest {
  HasCycle processor = new HasCycle();

  @Test
  void test_has_cycle() {
    final ListNode head = ListNode.of(1, 2, 3, 4, 5);
    final boolean hasCycle = processor.hasCycle(head);
    Assertions.assertThat(hasCycle).isFalse();
  }

  @Test
  void test_has_cycle2() {
    final ListNode head = ListNode.of(1, 2, 3, 4, 5);
    ListNode tail = getTail(head);
    tail.next = head;
    final boolean hasCycle = processor.hasCycle(head);
    Assertions.assertThat(hasCycle).isTrue();
  }

  private ListNode getTail(ListNode head) {
    ListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    return current;
  }
}
