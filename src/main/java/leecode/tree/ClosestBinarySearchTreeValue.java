package leecode.tree;

import static java.lang.StrictMath.abs;

import leecode.common.TreeNode;

/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is
 * closest to the target. Note: Given target value is a floating point. You are guaranteed to have
 * only one unique value in the BST that is closest to the target. Example: Input: root =
 * [4,2,5,1,3], target = 3.714286
 *
 * <pre>
 *     4
 *    / \
 *   2   5
 *  / \
 * 1   3
 * </pre>
 *
 * Output: 4
 */
public class ClosestBinarySearchTreeValue {

  public int closestValue(TreeNode node, double target) {

    if (node == null) {
      return 0;
    }

    int res = 0;

    while (node != null) {
      if (abs(res - target) >= abs(node.val - target)) {
        res = node.val;
      }
      node = target > node.val ? node.right : node.left;
    }

    return res;
  }
}
