package leecode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import leecode.common.TreeNode;

public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {

    LinkedList<List<Integer>> result = new LinkedList<>();

    if (root == null) {
      return result;
    }

    LinkedList<TreeNode> q = new LinkedList<>();
    q.add(root);

    while (!q.isEmpty()) {
      List<Integer> li = new ArrayList<>();
      for (int i = q.size() - 1; i >= 0; i--) {
        TreeNode node = q.pop();
        li.add(node.val);
        if (node.left != null) {
          q.add(node.left);
        }

        if (node.right != null) {
          q.add(node.right);
        }
      }
      result.addFirst(li);
    }
    return result;
  }


}
