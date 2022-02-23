package tree;

public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public void print() {
    print("", this, false);
  }

  public void print(String prefix, TreeNode n, boolean isLeft) {
    if (n != null) {
      System.out.println (prefix + (isLeft ? "|-- " : "\\-- ") + n.val);
      print(prefix + (isLeft ? "|   " : "    "), n.left, true);
      print(prefix + (isLeft ? "|   " : "    "), n.right, false);
    }
  }

  public static TreeNode of(int... elements) {
    TreeNode root = null;
    root = insertLevelOrder(elements, root, 0);
    return root;
  }

  private static TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
    if (i < arr.length) {
      root = new TreeNode(arr[i]);
      root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
      root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
    }
    return root;
  }
}
