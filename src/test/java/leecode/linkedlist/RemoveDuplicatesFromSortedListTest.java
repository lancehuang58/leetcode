package leecode.linkedlist;

import static org.junit.Assert.assertThat;

import leecode.common.ListNode;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {
  RemoveDuplicatesFromSortedList solution;

  @Before
  public void init() {
    solution = new RemoveDuplicatesFromSortedList();
  }

  @Test
  public void deleteDuplicates() {
    ListNode listNode =
        solution.deleteDuplicates(ListNode.buildNode(new int[] {1, 1, 2, 2, 2, 3, 3}));
    ListNode listNode1 = solution.deleteDuplicates(listNode);
    assertThat(listNode1.toArrayString(), Is.is("[1,2,3]"));
  }
}
