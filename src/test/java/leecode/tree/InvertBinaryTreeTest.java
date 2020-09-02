package leecode.tree;


import static org.junit.Assert.assertThat;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class InvertBinaryTreeTest {


  @Test
  public void given_tree_and_invert() {

    TreeNode treeNode = new ConvertSortedArrayToBST()
        .sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
    InvertBinaryTree solution = new InvertBinaryTree();
    TreeNode treeNode1 = solution.invertTree(treeNode);
    assertThat(treeNode1.left.val, Is.is(9));
    assertThat(treeNode1.right.val, Is.is(3));
  }
}