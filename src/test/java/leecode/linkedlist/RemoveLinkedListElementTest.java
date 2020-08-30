package leecode.linkedlist;

import static org.junit.Assert.*;

import leecode.common.ListNode;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class RemoveLinkedListElementTest {
  RemoveLinkedListElement solution;

  @Before
  public void setUp() {
    solution = new RemoveLinkedListElement();
  }

  @Test
  public void removeElements() {
    ListNode listNode = ListNode.buildNode(new int[] {1,4,3,2,5,2});
    ListNode listNode1 = solution.removeElements(listNode, 3);
    assertThat(listNode1.toArrayString(), Is.is("[1,4,2,5,2]"));
  }
}
