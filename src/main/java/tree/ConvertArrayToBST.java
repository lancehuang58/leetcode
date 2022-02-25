package tree;

public class ConvertArrayToBST {

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums.length == 0) return null;
    TreeNode root = constructTree(nums, 0, nums.length - 1);
    return root;
  }

  private TreeNode constructTree(int[] nums, int left, int right) {

    if (left > right) return null;

    int middle = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[middle]);
    node.left = constructTree(nums, left, middle - 1);
    node.right = constructTree(nums, middle + 1, right);
    return node;
  }
}
