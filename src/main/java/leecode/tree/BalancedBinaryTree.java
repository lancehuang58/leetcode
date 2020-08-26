package leecode.tree;

import leecode.common.TreeNode;

public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    return getHight(root) != -1;
  }

  private int getHight(TreeNode node) {
    if (node.left == null && node.right == null) {
      return 0;
    }

    int left = getHight(node.left);
    int right = getHight(node.right);

    if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
      return -1;
    }
    return Math.max(left, right) + 1;
  }
}
