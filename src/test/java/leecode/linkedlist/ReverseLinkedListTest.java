package leecode.linkedlist;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class ReverseLinkedListTest {

  @Test
  public void reverseList() {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode listNode = reverseLinkedList
        .reverseList(ListNodeBuilder.buildNode(new int[]{1, 2, 3, 4, 5}));
    assertThat(ListNodePrinter.toArrayString(listNode), Is.is("[5,4,3,2,1]"));
  }

  @Test
  public void test_reverse_node_self() {
    ListNode listNode = ListNodeBuilder.buildNode(new int[]{1, 2, 3, 4, 5});
    ListNode reverse = ListNodeUtility.reverse(listNode);
    assertThat(ListNodePrinter.toArrayString(reverse), Is.is("[5,4,3,2,1]"));
  }
}
