package leecode.tree;

import leecode.common.TreeNode;

public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode node) {
    if (node == null) {
      return true;
    }

    int rightTreeDiff = getDiff(node.right);
    int leftTreeDiff = getDiff(node.left);
    int diff = Math.abs(rightTreeDiff - leftTreeDiff);
    if (diff > 1) {
      return false;
    }
    return isBalanced(node.right) && isBalanced(node.left);
  }

  private int getDiff(TreeNode node) {
    if (node == null) {
      return 0;
    }
    return 1 + Math.max(getDiff(node.left), getDiff(node.right));
  }
}
