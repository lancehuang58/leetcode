package tree;
// solution: traverse all node from smallest to largest,
// if there is any node smaller than or equal current node value, return false;
public class ValidateBST {
  TreeNode last;

  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (!isValidBST(root.left)) return false;
    if (last != null && root.val <= last.val) return false;
    last = root;
    return isValidBST(root.right);
  }
}
