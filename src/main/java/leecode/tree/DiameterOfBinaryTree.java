package leecode.tree;

import leecode.common.TreeNode;

public class DiameterOfBinaryTree {

  public int diameterOfBinaryTree(TreeNode root) {
    //root
    if (root == null) {
      return 0;
    }

    //leaf node
    if (root.left == null && root.right == null) {
      return 0;
    }

    int rightDiameter = maxDepth(root.right);
    int leftDiameter = maxDepth(root.left);
    return rightDiameter + leftDiameter;
  }

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
