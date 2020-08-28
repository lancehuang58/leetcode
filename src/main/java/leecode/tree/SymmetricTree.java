package leecode.tree;

import java.util.Objects;
import leecode.common.TreeNode;

public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    if (Objects.isNull(root)) {
      return true;
    }

    return isMirror(root.left, root.right);
  }

  private boolean isMirror(TreeNode node1, TreeNode node2) {
    if (Objects.isNull(node1) || Objects.isNull(node2)) {
      return node1 == node2;
    }
    if (node2.val != node1.val) {
      return false;
    }
    return isMirror(node1.right, node2.left) || isMirror(node2.left, node1.right);
  }
}
