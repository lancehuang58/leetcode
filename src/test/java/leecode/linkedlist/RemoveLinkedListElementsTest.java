package leecode.linkedlist;

import static org.junit.Assert.*;

import leecode.common.ListNode;
import org.junit.Before;
import org.junit.Test;

public class RemoveLinkedListElementsTest {

  RemoveLinkedListElements solution;

  @Before
  public void init() {
    solution = new RemoveLinkedListElements();
  }

  @Test
  public void removeElements() {
    ListNode listNode = ListNode.buildNode(new int[]{1, 2, 3, 4, 5});
    System.out.println("listNode.toArrayString() = " + listNode.toArrayString());
    solution.removeElements(listNode,3);
  }
}