package leecode.tree;

import leecode.common.TreeNode;

public class SubtreeOfAnotherTree {

  public boolean isSubTree(TreeNode s, TreeNode t) {
    if (s == null || t == null) {
      return s == t;
    }

    if (s.val == t.val) {
      if (compare(s, t)) {
        return true;
      }
    }
    return (s.left != null && isSubTree(s.left, t)) || (s.right != null && isSubTree(s.right, t));
  }

  private boolean compare(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
      return true;
    } else if (s == null || t == null || s.val != t.val) {
      return false;
    }
    return compare(s.left, t.left) && compare(s.right, t.right);
  }
}
