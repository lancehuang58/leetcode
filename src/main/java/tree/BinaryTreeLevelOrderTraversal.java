package tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    Map<Integer, List<Integer>> collection = new HashMap<>();
    int level = 1;
    traverse(root, level, collection);
    return new ArrayList<>(collection.values());
  }

  private void traverse(TreeNode root, int level, Map<Integer, List<Integer>> collection) {
    level++;
    if (root.left != null) traverse(root.left, level, collection);
    level--;

    collection.merge(level, new ArrayList<>(), (k, v) -> {v.add(root.val);return v;});

//    if (!collection.containsKey(level)) {
//      List<Integer> l = new ArrayList<>();
//      l.add(root.val);
//      collection.put(level, l);
//    } else {
//      collection.get(level).add(root.val);
//    }

    level++;
    if (root.right != null) traverse(root.right, level, collection);
  }
}
