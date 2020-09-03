package leecode.tree;

import leecode.common.TreeNode;

public class DiameterOfBinaryTree {

  int maxLength = 0;

  public int diTree(TreeNode node) {
    if (node != null) {
      if (node.left == null && node.right == null) {
        return 0;
      }
      int leftTreeLength = diTree(node.left) + 1;
      int rightTreeLength = diTree(node.right) + 1;
      maxLength = Math.max(maxLength, rightTreeLength + leftTreeLength);
      return Math.max(leftTreeLength, rightTreeLength);
    }

    return -1;
  }

  public int diameterOfBinaryTree(TreeNode root) {
    diTree(root);
    return maxLength;
  }
}
