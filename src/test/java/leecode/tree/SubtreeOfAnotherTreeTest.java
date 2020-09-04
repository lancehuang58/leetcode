package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.junit.Test;

public class SubtreeOfAnotherTreeTest {

  SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();

  @Test
  public void given_null_tree_with_null_target_then_return_true() {
    boolean isSubTree = solution.isSubTree(null, null);
    assertTrue(isSubTree);
  }

  @Test
  public void given_simple_tree_with_null_target_then_return_false() {
    boolean isSubTree = solution.isSubTree(TreeNode.of(1), null);
    assertFalse(isSubTree);
  }

  @Test
  public void given_simple_tree_with_one_target_node_then_return_true() {
    boolean isSubTree = solution.isSubTree(TreeNode.of(1), TreeNode.of(1));
    assertTrue(isSubTree);
  }
}
