package leecode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import leecode.common.TreeNode;

public class AverageOfLevelsInBinaryTree {

  public List<Double> averageOfLevels(TreeNode root) {

    List<Double> res = new ArrayList<>();
    LinkedList<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      List<Integer> li = new ArrayList<>();
      for (int i = queue.size() - 1; i >= 0; i--) {
        TreeNode node = queue.pop();
        li.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      res.add(li.stream().mapToInt(x -> x).average().getAsDouble());
    }
    return res;
  }
}
