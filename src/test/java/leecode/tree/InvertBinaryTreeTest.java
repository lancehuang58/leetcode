package leecode.tree;


import leecode.common.TreeNode;
import org.junit.Test;

public class InvertBinaryTreeTest {


  @Test
  public void given_tree_and_invert() {

    TreeNode treeNode = new ConvertSortedArrayToBST()
        .sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});

    BTreePrinter.printNode(treeNode);

    InvertBinaryTree solution = new InvertBinaryTree();
    TreeNode treeNode1 = solution.invertTree(treeNode);
    BTreePrinter.printNode(treeNode1);

  }
}