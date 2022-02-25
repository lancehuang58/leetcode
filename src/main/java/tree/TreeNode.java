package tree;

import java.util.LinkedList;
import java.util.Queue;

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

  public int[] toArray() {
    Queue<Integer> queue = new LinkedList<>();
    populate(this, queue);
    return queue.stream().mapToInt(c -> c).toArray();
  }

  private void populate(TreeNode node, Queue<Integer> queue) {
    if (node.left != null) {
      populate(node.left, queue);
    }
    queue.offer(node.val);
    if (node.right != null) {
      populate(node.right, queue);
    }
  }
}
