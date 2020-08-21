package leecode.linkedlist;

import static org.junit.Assert.*;

import java.util.List;
import leecode.common.ListNode;
import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedListTest {

  @Test
  public void reverseList() {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    ListNode listNode = reverseLinkedList.reverseList(ListNode.buildNode(new int[]{1, 2, 3, 4, 5}));
    System.out.println("listNode.toArrayString() = " + listNode.toArrayString());
  }
}
