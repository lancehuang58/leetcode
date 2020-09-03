package leecode.tree;

import java.util.ArrayList;
import java.util.List;
import leecode.common.TreeNode;

public class FindModeInBinarySearchTree {

  int count = 0;
  int max = 0;
  int lookFor = 0;
  List<Integer> list = new ArrayList<>();

  public int[] findMode(TreeNode root) {
    if (root != null) {
      traverse(root);
    }
    return list.stream().mapToInt(x -> x).toArray();
  }

  private void traverse(TreeNode root) {

    if (root.left != null) {
      traverse(root.left);
    }

    if (root == null) {
      return;
    }

    if (root.val == lookFor) {
      count++;
    } else {
      lookFor = root.val;
      count = 1;
    }

    if (count >= max) {
      if (count > max) {
        list.clear();
        max = count;
      }
      list.add(root.val);
    }
    if (root.right != null) {
      traverse(root.right);
    }
  }
}
