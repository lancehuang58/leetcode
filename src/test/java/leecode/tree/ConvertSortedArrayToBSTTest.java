package leecode.tree;


import leecode.common.TreeNode;
import org.junit.Test;

public class ConvertSortedArrayToBSTTest {


  ConvertSortedArrayToBST solution = new ConvertSortedArrayToBST();

  @Test
  public void sortedArrayToBST() {
    TreeNode treeNode = solution.sortedArrayToBST(new int[]{1, 2, 3, 4, 5});
    BTreePrinter.printNode(treeNode);

  }
}