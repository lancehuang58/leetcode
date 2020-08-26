package leecode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import leecode.common.TreeNode;

public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }
    LinkedList<List<Integer>> queue = new LinkedList<>();
    processList(queue, root);
    queue.offer(Arrays.asList(root.val));
    return queue;
  }

  private void processList(LinkedList<List<Integer>> list, TreeNode root) {
    List<Integer> list1 = new ArrayList<>();

    if (root.left != null) {
      list1.add(root.left.val);
      processList(list, root.left);
    }

    if (root.right != null) {
      list1.add(root.right.val);
      processList(list, root.right);
    }

    if (!list1.isEmpty()) {
      list.offer(list1);
    }
  }
}
