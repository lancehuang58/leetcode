package leecode.linkedlist;

import static org.junit.Assert.*;

import java.util.List;
import leecode.common.ListNode;
import org.junit.Before;
import org.junit.Test;

public class RemoveLinkedListElementTest {
  RemoveLinkedListElement solution;

  @Before
  public void setUp() throws Exception {
    solution = new RemoveLinkedListElement();
  }

  @Test
  public void removeElements() {
    ListNode listNode = ListNode.buildNode(new int[] {1,4,3,2,5,2});
    ListNode listNode1 = solution.removeElements(listNode, 3);
    System.out.println("listNode1.toArrayString() = " + listNode1.toArrayString());
    //    ListNode listNode2 = solution.removeElements(listNode1, 3);
    //    System.out.println("listNode2.toArrayString() = " + listNode2.toArrayString());
    //    ListNode listNode3 = solution.removeElements(listNode2, 6);
    //    System.out.println("listNode3.toArrayString() = " + listNode3.toArrayString());
  }
}
