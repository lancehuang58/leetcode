package leecode.tree;

import java.util.Objects;
import leecode.common.TreeNode;

public class PathSum {

  public boolean hasPathSum(TreeNode node, int sum) {

    if (Objects.isNull(node)) {
      return false;
    }

    if (node.val == sum && Objects.isNull(node.right) && Objects.isNull(node.left)) {
      return true;
    }

    return hasPathSum(node.right, sum - node.val) || hasPathSum(node.left, sum - node.val);
  }
}
