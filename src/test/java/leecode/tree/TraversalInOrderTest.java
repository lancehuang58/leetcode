package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.junit.Test;

public class TraversalInOrderTest {

  TraversalInOrder strategy = new TraversalInOrder();

//  @Test
  public void traverse_in_order() {
    TreeNode treeNode = new ConvertSortedArrayToBST()
        .sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 7});
    BTreePrinter.printNode(treeNode);
    strategy.traverse(treeNode);

  }
}