package leecode.tree;

import leecode.common.TreeNode;

public class LowestCommonAncestorOfBST {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    while (root != null) {
      if ((root.val - p.val) * (root.val - q.val) < 0) {
        return root;
      }
      root = p.val < root.val ? root.left : root.right;
    }
    return null;
  }
}
