package leecode.tree;

import leecode.common.TreeNode;

public class ConvertSortedArrayToBST {

  public TreeNode sortedArrayToBST(int[] nums) {

    return buildBST(nums, 0, nums.length - 1);
  }

  private TreeNode buildBST(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    TreeNode node = TreeNode.of(nums[mid]);

    node.left = buildBST(nums, start, mid - 1);
    node.right = buildBST(nums, mid + 1, end);
    return node;
  }

}
