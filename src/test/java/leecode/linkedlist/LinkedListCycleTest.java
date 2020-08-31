package leecode.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * <p>To represent a cycle in the given linked list, we use an integer pos which represents the
 * position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no
 * cycle in the linked list.
 *
 * <p>Example 1:
 *
 * <p>Input: head = [3,2,0,-4], pos = 1 Output: true Explanation: There is a cycle in the linked
 * list, where tail connects to the second node.
 */
public class LinkedListCycleTest {

  ListNode testNode;

  @Before
  public void setUp() throws Exception {
    testNode = new ListNode(3);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(0);
    ListNode node4 = new ListNode(-4);
    testNode.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node2;
  }

  @Test
  public void test() {
    LinkedListCycle sol = new LinkedListCycle();
    boolean cycleListNode = sol.hasCycle(testNode);
    assertTrue(cycleListNode);
  }
}
