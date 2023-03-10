package linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MiddleOfLinkedListTest {

  final MiddleOfLinkedList.Solution solution = new MiddleOfLinkedList.Solution();

  @Test
  void test_solution() {
    ListNode head = ListNodeUtil.build(new int[] {1, 2, 3, 4, 5});
    ListNode listNode = solution.middleNode(head);
    ListNodeUtil.print(listNode);
    verifyNodes(listNode, ListNodeUtil.build(new int[] {3, 4, 5}));
  }

  @Test
  void test_case2() {
    ListNode head = ListNodeUtil.build(new int[] {1, 2, 3, 4, 5, 6});
    ListNode listNode = solution.middleNode(head);
    ListNodeUtil.print(listNode);
    verifyNodes(listNode, ListNodeUtil.build(new int[] {4, 5, 6}));
  }

  private void verifyNodes(ListNode middleNode, ListNode expectedNode) {
    Assertions.assertThat(middleNode).isNotNull();
    Assertions.assertThat(expectedNode).isNotNull();
    assertNodeVal(middleNode, expectedNode);
    if (middleNode.next != null && expectedNode.next != null) {
      verifyNodes(middleNode.next, expectedNode.next);
    }
  }

  private void assertNodeVal(ListNode middleNode, ListNode expectedNode) {
    Assertions.assertThat(middleNode.val).isEqualTo(expectedNode.val);
  }
}
