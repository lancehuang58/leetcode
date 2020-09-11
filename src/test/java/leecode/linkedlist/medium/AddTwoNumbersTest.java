package leecode.linkedlist.medium;

import static org.junit.Assert.assertThat;

import leecode.linkedlist.ListNode;
import leecode.linkedlist.ListNodeBuilder;
import leecode.linkedlist.ListNodePrinter;
import org.hamcrest.core.Is;
import org.junit.Test;

public class AddTwoNumbersTest {
  AddTwoNumbers solution = new AddTwoNumbers();

  @Test
  public void testing() {
    ListNode node1 = ListNodeBuilder.buildNode(new int[] {2, 4, 3});
    ListNode node2 = ListNodeBuilder.buildNode(new int[] {5, 6, 7});
    ListNode node3 = solution.addTwoNumbers(node1, node2);
    assertThat(ListNodePrinter.toArrayString(node3), Is.is("[7,0,1,1]"));
  }
}
