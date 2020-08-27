package leecode.tree;

import java.util.LinkedList;
import java.util.List;
import leecode.common.TreeNode;

public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null || q == null) {
      return p == q;
    }

    if (p.val != q.val) {
      return false;
    }

    return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
  }

  public boolean isSameTree2(TreeNode p, TreeNode q) {
    if (p == null || q == null) {
      return p == q;
    }

    if (p.val != q.val) {
      return false;
    }

    List<Integer> pList = buildList(p);
    List<Integer> qList = buildList(q);
    return pList.equals(qList);
  }

  private List<Integer> buildList(TreeNode p) {
    List<Integer> collector = new LinkedList<>();
    traverse(p, collector);
    return collector;
  }

  private void traverse(TreeNode p, List<Integer> collector) {
    collector.add(p.val);

    if (p.left == null) {
      collector.add(null);
    } else {
      traverse(p.left, collector);
    }

    if (p.right == null) {
      collector.add(null);
    } else {
      traverse(p.right, collector);
    }

  }
}
