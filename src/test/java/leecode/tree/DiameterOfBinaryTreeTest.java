package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class DiameterOfBinaryTreeTest {

  DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

  @Test
  public void given_single_node_tree_then_get_diameter_of_tree_and_return_0() {
    int i = solution.diameterOfBinaryTree(TreeNode.of(1));
    assertThat(i, Is.is(0));
  }

  @Test
  public void given_null_tree_then_get_diameter_of_tree_and_return_0() {
    int i = solution.diameterOfBinaryTree(null);
    assertThat(i, Is.is(0));
  }

  @Test
  public void given_2_node_tree_then_get_diameter_of_tree_and_return_0() {
    int i = solution.diameterOfBinaryTree(new TreeNode(1, TreeNode.of(2), null));
    assertThat(i, Is.is(1));
  }
}