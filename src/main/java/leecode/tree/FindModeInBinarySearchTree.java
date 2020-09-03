package leecode.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import leecode.common.TreeNode;

public class FindModeInBinarySearchTree {

  public int[] findMode(TreeNode root) {
    if (root == null) {
      return new int[] {};
    }

    Map<Integer, Integer> countingMap = new HashMap<>();
    helper(root, countingMap);
    Integer max = countingMap.values().stream().mapToInt(v -> v).max().getAsInt();

    Iterator<Entry<Integer, Integer>> iterator = countingMap.entrySet().iterator();
    List<Integer> list = new LinkedList<>();
    while (iterator.hasNext()) {
      Entry<Integer, Integer> next = iterator.next();
      if (next.getValue() == max) {
        list.add(next.getKey());
      }
    }
    return list.stream().mapToInt(i -> i).toArray();
  }

  private void helper(TreeNode root, Map<Integer, Integer> countingMap) {
    if (root == null) {
      return;
    }
    countingMap.merge(root.val, 1, Integer::sum);
    helper(root.right, countingMap);
    helper(root.left, countingMap);
  }
}
