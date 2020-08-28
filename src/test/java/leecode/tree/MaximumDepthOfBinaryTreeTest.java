package leecode.tree;

import static org.hamcrest.MatcherAssert.assertThat;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class MaximumDepthOfBinaryTreeTest {

  MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

  @Test
  public void given_single_node_then_return_1() {
    int maxDepth = solution.maxDepth(TreeNode.of(1));
    assertThat(maxDepth, Is.is(1));
  }

  @Test
  public void given_null_node_then_return_0() {
    int maxDepth = solution.maxDepth(null);
    assertThat(maxDepth, Is.is(0));
  }

  @Test
  public void given_2_node_the_return_2() {
    int maxDepth = solution.maxDepth(new TreeNode(1, TreeNode.of(2), null));
    System.out.println("maxDepth = " + maxDepth);
  }
}
