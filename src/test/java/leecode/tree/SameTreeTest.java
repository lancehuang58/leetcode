package leecode.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import leecode.common.TreeNode;
import org.junit.Test;

public class SameTreeTest {

  SameTree solution = new SameTree();

  @Test
  public void given_2_node_and_then_return_true() {
    boolean sameTree = solution.isSameTree(new TreeNode(1, TreeNode.of(2), TreeNode.of(3))
        , new TreeNode(1, TreeNode.of(2), TreeNode.of(3)));
    assertTrue(sameTree);
  }

  @Test
  public void given_2_node_and_then_return_false() {
    boolean sameTree = solution.isSameTree(new TreeNode(1, TreeNode.of(2), TreeNode.of(1))
        , new TreeNode(1, TreeNode.of(1), TreeNode.of(2)));
    assertFalse(sameTree);
  }

  @Test
  public void given_2_node_with_null_and_then_return_false(){
    boolean sameTree = solution.isSameTree(new TreeNode(1, TreeNode.of(2), null)
        , new TreeNode(1, null, TreeNode.of(2)));
    assertFalse(sameTree);
  }
}
