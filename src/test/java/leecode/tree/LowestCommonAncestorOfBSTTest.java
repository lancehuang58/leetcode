package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class LowestCommonAncestorOfBSTTest {

  LowestCommonAncestorOfBST solution = new LowestCommonAncestorOfBST();

  @Test
  public void given_bts_and_find_the_lowest_common_ancestor() {
    ConvertSortedArrayToBST convertSortedArray = new ConvertSortedArrayToBST();
    TreeNode treeNode = convertSortedArray
        .sortedArrayToBST(new int[]{2, 4, 6, 8, 9, 10, 11, 12});
    BTreePrinter.printNode(treeNode);
    TreeNode treeNode1 = solution.lowestCommonAncestor(treeNode, TreeNode.of(9), TreeNode.of(12));
    assertThat(treeNode1.val, Is.is(10));
  }


  @Test
  public void given_bts_and_find_the_lowest_common_ancestor2() {
    ConvertSortedArrayToBST convertSortedArray = new ConvertSortedArrayToBST();
    TreeNode treeNode = convertSortedArray
        .sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
    BTreePrinter.printNode(treeNode);
    TreeNode treeNode1 = solution.lowestCommonAncestor(treeNode, TreeNode.of(2), TreeNode.of(8));
    assertThat(treeNode1.val, Is.is(6));
  }
}