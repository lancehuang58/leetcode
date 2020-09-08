package leecode.linkedlist;

import static org.junit.Assert.assertThat;

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
    ListNode listNode = ListNodeBuilder.buildNode(new int[] {1, 4, 3, 2, 5, 2});
    ListNode listNode1 = solution.removeElements(listNode, 3);
    assertThat(ListNodePrinter.toArrayString(listNode1), Is.is("[1,4,2,5,2]"));
  }
}
