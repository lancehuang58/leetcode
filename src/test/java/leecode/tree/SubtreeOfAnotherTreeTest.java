package leecode.tree;

import static org.assertj.core.api.Assertions.assertThat;

import leecode.common.TreeNode;
import org.junit.jupiter.api.Test;


public class SubtreeOfAnotherTreeTest {

  SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();

  @Test
  public void given_null_tree_with_null_target_then_return_true() {
    assertThat(solution.isSubTree(null, null))
        .isTrue();
  }

  @Test
  public void given_simple_tree_with_null_target_then_return_false() {
    assertThat(solution.isSubTree(TreeNode.of(1), null)).isFalse();
  }

  @Test
  public void given_simple_tree_with_one_target_node_then_return_true() {
    assertThat(solution.isSubTree(TreeNode.of(1), TreeNode.of(1))).isTrue();
  }
}
