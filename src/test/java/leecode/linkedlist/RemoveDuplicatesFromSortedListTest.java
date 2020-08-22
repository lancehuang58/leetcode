package leecode.linkedlist;

import leecode.common.ListNode;
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
    System.out.println("listNode1 = " + listNode1.toArrayString());
  }
}
