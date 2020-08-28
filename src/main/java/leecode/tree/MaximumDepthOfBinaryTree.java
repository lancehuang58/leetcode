package leecode.tree;

import java.util.Objects;
import leecode.common.TreeNode;

public class MaximumDepthOfBinaryTree {

  public int maxDepth(TreeNode root) {
    if (Objects.isNull(root)) {
      return 0;
    } else {
      int result = 1;
      int r_depth = maxDepth(root.right);
      int l_depth = maxDepth(root.left);

      if (l_depth >= r_depth) {
        return result + l_depth;
      } else {
        return result + r_depth;
      }
    }
  }
}
