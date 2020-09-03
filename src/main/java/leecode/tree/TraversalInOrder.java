package leecode.tree;

import leecode.common.TreeNode;

public class TraversalInOrder {

  public void traverse(TreeNode node) {
    if (node != null) {
      if (node.left != null) {
        traverse(node.left);
      }

      System.out.println("node = " + node.val);

      if (node.right != null) {
        traverse(node.right);
      }
    }
  }
}
