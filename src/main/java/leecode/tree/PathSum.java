package leecode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import leecode.common.TreeNode;

public class PathSum {

  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }

    List<Integer> sumPath = new ArrayList<>();
    Boolean result = new Boolean(false);
    traverse(sumPath, root, sum, result);
    System.out.println("result = " + result);
    return result;
  }

  private void traverse(List<Integer> sumPath, TreeNode root, int sum, Boolean result) {
    if (root != null) {
      sumPath.add(root.val);
      if (root.right == null && root.left == null) {
        int r = sumPath.stream().collect(Collectors.summingInt(Integer::intValue)).intValue();
        result = (r == sum);
      }

      if (root.right != null) {
        traverse(sumPath, root.right, sum, result);
      }
      if (root.left != null) {
        traverse(sumPath, root.left, sum, result);
      }
    }
  }
}
