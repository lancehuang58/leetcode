package leecode.linkedlist;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class PartitionListTest {

  // 1->4->3->2->5->2
  // output 1->2->2->4->3->5
  @Test
  public void partition() {
    int[] order = {1, 4, 3, 2, 5, 2};
    ListNode listNode = ListNodeBuilder.buildNode(order);
    PartitionList partitionList = new PartitionList();
    ListNode p1 = partitionList.partition(listNode, 3);
    assertThat(ListNodePrinter.toArrayString(p1), Is.is("[1,2,2,4,3,5]"));
  }
}
