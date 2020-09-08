package leecode.tree;

import static java.lang.Math.abs;

import leecode.common.TreeNode;

public class BinaryTreeTilt {

  int diff = 0;

  public int findTilt(TreeNode node) {

    helper(node);
    return diff;
  }

  private int helper(TreeNode node) {
    if (node == null) {
      return 0;
    }

    System.out.println("node = " + node.val);

    int left = helper(node.left);
    System.out.println("left = " + left);
    int right = helper(node.right);
    System.out.println("right = " + right);

    diff += abs(left - right);

    return node.val + left + right;
  }
}
