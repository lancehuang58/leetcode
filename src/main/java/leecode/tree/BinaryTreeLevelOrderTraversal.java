package leecode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import leecode.common.TreeNode;

public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    Map<Integer, List<Integer>> levelMap = new HashMap<>();
    traverse(levelMap, root, 0);
    Stream<List<Integer>> reverse = reverse(levelMap.values().stream());
    List<List<Integer>> collect = reverse.collect(Collectors.toList());
    return collect;
  }

  public static <T> Stream<T> reverse(Stream<T> stream) {
    return stream
        .collect(Collector.of(
            () -> new ArrayDeque<T>(),
            ArrayDeque::addFirst,
            (q1, q2) -> {
              q2.addAll(q1);
              return q2;
            })
        )
        .stream();
  }

  private void traverse(Map<Integer, List<Integer>> levelMap, TreeNode node, int i) {
    if (node == null) {
      return;
    }

    putValueToLevel(levelMap, node.val, i);
    traverse(levelMap, node.left, i + 1);
    traverse(levelMap, node.right, i + 1);
  }

  private void putValueToLevel(Map<Integer, List<Integer>> levelMap, int val, int i) {
    if (levelMap.get(i) == null) {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(val);
      levelMap.put(i, list);
    } else {
      levelMap.get(i).add(val);
    }
  }


}
