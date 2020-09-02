package leecode.tree;

import static org.junit.Assert.assertThat;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest {

  MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

  @Test
  public void given_null_tree_and_then_return_0() {
    int minDepth = solution.minDepth(null);
    assertThat(minDepth, Is.is(0));
  }

  @Test
  public void given_single_node_and_then_return_1() {
    int minDepth = solution.minDepth(TreeNode.of(1));
    assertThat(minDepth, Is.is(1));
  }

  @Test
  public void given_multiple_nodes_and_then_return_2() {
    int minDepth = solution
        .minDepth(new TreeNode(1, TreeNode.of(2), new TreeNode(3, null, TreeNode.of(4))));
    assertThat(minDepth, Is.is(2));
  }
}