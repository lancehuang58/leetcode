package leecode.linkedlist;

import static org.junit.Assert.assertThat;

import leecode.common.ListNode;
import org.hamcrest.core.Is;
import org.junit.Test;

/** Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4 */
public class MergeTwoSortedListsTest {
  MergeTwoSortedLists process = new MergeTwoSortedLists();

  @Test
  public void mergeTwoLists() {
    ListNode list1 = new ListNode(1).next(new ListNode(2).next(new ListNode(4)));

    ListNode list2 = new ListNode(1).next(new ListNode(3).next(new ListNode(4)));

    ListNode listNode = process.mergeTwoLists(list1, list2);
    assertThat(listNode.toArrayString(), Is.is("[1,1,2,3,4,4]"));
  }
}
