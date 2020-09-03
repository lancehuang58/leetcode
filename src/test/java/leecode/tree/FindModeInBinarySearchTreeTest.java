package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class FindModeInBinarySearchTreeTest {

  FindModeInBinarySearchTree solution = new FindModeInBinarySearchTree();

  @Test
  public void given_null_tree_return_null_array_() {
    int[] mode = solution.findMode(null);
    assertThat(mode.length, Is.is(0));
  }

  @Test
  public void given_single_node_tree_and_then_return_one_element_array() {
    int[] mode = solution.findMode(TreeNode.of(1));
    assertThat(mode[0], Is.is(1));
  }

  @Test
  public void given_multiple_nodes_tree_and_then_return_mode_element_array() {
    int[] mode = solution.findMode(new TreeNode(1, TreeNode.of(2), TreeNode.of(2)));
    assertThat(mode[0], Is.is(2));
  }
}
