package leecode.tree;

import leecode.common.TreeNode;

public class MinimumDepthOfBinaryTree {

  /**
   * Get nodes of shortest path of tree
   *
   * @param root root node
   * @return size of nodes of shortest path of tree
   */
  public int minDepth(TreeNode root) {
    return helper(root);
  }

  private int helper(TreeNode node) {
    if (node == null) {
      return 0;
    }

    if (node.right == null && node.left == null) {
      return 1;
    }

    if (node.left == null) {
      return helper(node.right) + 1;
    }

    if (node.right == null) {
      return helper(node.left) + 1;
    }

    int left = helper(node.left) + 1;
    int right = helper(node.right) + 1;
    return Math.min(left, right);
  }
}
