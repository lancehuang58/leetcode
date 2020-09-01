package leecode.tree;

import java.util.Objects;
import leecode.common.TreeNode;

public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int rightChildDepth = maxDepth(root.right);
    int leftChildDepth = maxDepth(root.left);
    if (rightChildDepth >= leftChildDepth) {
      return rightChildDepth + 1;
    } else {
      return leftChildDepth + 1;
    }
  }
}
