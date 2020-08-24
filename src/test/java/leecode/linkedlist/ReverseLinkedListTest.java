package leecode.linkedlist;

import static org.junit.Assert.assertThat;

import leecode.common.ListNode;
import leecode.common.Wrapper;
import org.hamcrest.core.Is;
import org.junit.Test;

public class ReverseLinkedListTest {

  @Test
  public void reverseList() {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode listNode = reverseLinkedList.reverseList(ListNode.buildNode(new int[]{1, 2, 3, 4, 5}));
    assertThat(listNode.toArrayString(), Is.is("[5,4,3,2,1]"));
  }

  @Test
  public void test_reverse_node_self() {
    ListNode listNode = ListNode.buildNode(new int[]{1, 2, 3, 4, 5});
    ListNode reverse = listNode.reverse();
    assertThat(reverse.toArrayString(), Is.is("[5,4,3,2,1]"));
  }
}
