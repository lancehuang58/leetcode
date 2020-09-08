package leecode.tree.medium;

import java.util.ArrayList;
import java.util.List;
import leecode.common.TreeNode;

public class PathSum3 {

  public int pathSum(TreeNode root, int sum) {

    if (root == null) {
      return 0;
    }

    TreeWalker iterator = new TreeWalker(sum);
    iterator.traverse(root);
    return iterator.getNumberOfMatch();
  }

  private static class TreeWalker {

    private final int target;
    private int numberOfMatch = 0;

    public TreeWalker(int target) {
      this.target = target;
    }

    private void traverse(TreeNode node) {

      if (node == null) {
        return;
      }

      eachNode(node, new ArrayList<>());

      if (node.left != null) {
        traverse(node.left);
      }
      if (node.right != null) {
        traverse(node.right);
      }
    }

    private void eachNode(TreeNode node, List<Integer> elements) {
      if (node == null) {
        return;
      }
      elements.add(node.val);
      int currentSum = elements.stream().mapToInt(i -> i).sum();
      if (currentSum == target) {
        numberOfMatch++;
      }
      eachNode(node.left, elements);
      eachNode(node.right, elements);
      elements.remove(elements.size() - 1);
    }

    public int getNumberOfMatch() {
      return this.numberOfMatch;
    }
  }
}
