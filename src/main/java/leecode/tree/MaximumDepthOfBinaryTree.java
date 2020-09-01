package leecode.tree;

import leecode.common.TreeNode;

public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null && root.right == null) {
      return 1;
    }

    return Math.max(maxDepth(root.right), maxDepth(root.left)) + 1;

  }
}
