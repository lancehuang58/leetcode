package leecode.tree;

import leecode.common.TreeNode;

public class ConvertSortedArrayToBST {

  public TreeNode sortedArrayToBST(int[] nums) {

    if (nums == null || nums.length == 0) {
      return null;
    }

    TreeNode node = buildBinarySearchTree(nums, 0, nums.length - 1);
    return node;
  }

  private TreeNode buildBinarySearchTree(int[] nums, int l, int r) {

    if (l > r) {
      return null;
    }

    int midIndex = l + (r - l) / 2;
    System.out.println("======================= ");
    System.out.println("midIndex = " + midIndex);

    int num = nums[midIndex];
    TreeNode node = TreeNode.of(num);
    System.out.println("num = " + num);
    System.out.println("======================= ");
    node.left = buildBinarySearchTree(nums, l, midIndex - 1);
    node.right = buildBinarySearchTree(nums, midIndex + 1, r);
    return node;
  }

}
