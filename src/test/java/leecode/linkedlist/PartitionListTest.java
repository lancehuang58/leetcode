package leecode.linkedlist;

import static org.junit.Assert.*;

import leecode.common.ListNode;
import org.junit.Test;

public class PartitionListTest {
  // 1->4->3->2->5->2
  @Test
  public void partition() {
    int[] order = {1, 4, 3, 2, 5, 2};
    ListNode listNode = ListNode.buildNode(order);
    listNode.printNode();

    PartitionList partitionList = new PartitionList();
    ListNode p1 = partitionList.partition(listNode, 3);
    p1.printNode();
  }
}
