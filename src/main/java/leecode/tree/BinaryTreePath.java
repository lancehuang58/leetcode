package leecode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import leecode.common.TreeNode;

public class BinaryTreePath {

  public List<String> binaryTreePaths(TreeNode root) {
    List<String> res = new ArrayList<>();
    binaryTreePaths(root, new ArrayList<>(), res);
    return res;
  }

  private void binaryTreePaths(TreeNode root, ArrayList<Integer> arrayList, List<String> res) {
    if (root == null) {
      return;
    }
    arrayList.add(root.val);
    if (root.right == null && root.left == null) {
      res.add(arrayList.stream().map(String::valueOf).collect(Collectors.joining("->")));
    }
    binaryTreePaths(root.left, arrayList, res);
    binaryTreePaths(root.right, arrayList, res);
    arrayList.remove(arrayList.size() - 1);
  }
}
