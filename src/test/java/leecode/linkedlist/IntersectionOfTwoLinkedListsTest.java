package leecode.linkedlist;

import static org.junit.Assert.*;

//import leecode.common.ListNode;
import leecode.common.ListNode;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {
  IntersectionOfTwoLinkedLists solution;
  ListNode listNodeA;
  ListNode listNodeB;

  @Before
  public void setUp() throws Exception {
    solution = new IntersectionOfTwoLinkedLists();

    ListNode listNode1 = ListNode.buildNode(new int[] {4, 2});
    ListNode listNode2 = ListNode.buildNode(new int[] {5, 6, 1});
    ListNode listNode3 = ListNode.buildNode(new int[] {10, 11, 12});

    listNode1.last().next = listNode3;
    listNode2.last().next = listNode3;
    listNodeA  = listNode1;
    listNodeB = listNode2;
  }

  @Test
  public void getIntersectionNode() {
    ListNode intersectionNode = solution.getIntersectionNode(listNodeA, listNodeB);
    assertThat(intersectionNode.val, Is.is(10));
  }
}
