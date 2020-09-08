package leecode.linkedlist;

import static org.junit.Assert.*;

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

    ListNode listNode1 = ListNodeBuilder.buildNode(new int[] {4, 2});
    ListNode listNode2 = ListNodeBuilder.buildNode(new int[] {5, 6, 1});
    ListNode listNode3 = ListNodeBuilder.buildNode(new int[] {10, 11, 12});

    ListNodeUtility.last(listNode1).next = listNode3;
    ListNodeUtility.last(listNode2).next = listNode3;
    listNodeA = listNode1;
    listNodeB = listNode2;
  }

  @Test
  public void getIntersectionNode() {
    ListNode intersectionNode = solution.getIntersectionNode(listNodeA, listNodeB);
    assertThat(intersectionNode.val, Is.is(10));
  }
}
