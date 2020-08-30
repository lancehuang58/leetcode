package leecode.tree;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class MinimumDepthOfBinaryTreeTest {

  MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();

  @Test
  public void given_null_tree_and_then_return_0() {
    int minDepth = solution.minDepth(null);
    assertThat(minDepth, Is.is(0));
  }
}