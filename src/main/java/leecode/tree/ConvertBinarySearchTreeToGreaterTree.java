package leecode.tree;

import leecode.common.TreeNode;

public class ConvertBinarySearchTreeToGreaterTree {

  int sum = 0;

  public TreeNode convertBST(TreeNode root) {
    traverse(root);
    return root;
  }

  private void traverse(TreeNode node) {

    if (node != null) {
      traverse(node.right);
      sum += node.val;
      node.val = sum;
      traverse(node.left);
    }
  }
}
