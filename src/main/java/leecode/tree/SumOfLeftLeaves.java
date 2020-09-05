package leecode.tree;

import leecode.common.TreeNode;

public class SumOfLeftLeaves {

  int sum = 0;

  public int sumOfLeftLeaves(TreeNode root) {

    if (root == null) {
      return 0;
    }

    traverse(root);
    return sum;
  }

  private boolean isLeaf(TreeNode node) {
    return node != null && node.left == null && node.right == null;
  }

  private void traverse(TreeNode node) {
    if (node == null) {
      return;
    }
    if (isLeaf(node.left)) {
      sum += node.left.val;
    }

    traverse(node.left);
    traverse(node.right);
  }
}
