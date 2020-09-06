package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class ClosestBinarySearchTreeValueTest {

  ClosestBinarySearchTreeValue solution = new ClosestBinarySearchTreeValue();

  @Test
  public void given_null_tree_then_return_0() {
    int i = solution.closestValue(null, 1);
    assertThat(i, Is.is(0));
  }

  @Test
  public void given_multiple_nodes_tree_then_return_1() {
    TreeNode root = new TreeNode(4, TreeNode.of(2), TreeNode.of(5));
    root.left.left = TreeNode.of(1);
    root.left.right = TreeNode.of(3);
    BTreePrinter.printNode(root);

    int i = solution.closestValue(root, 1.7);

    assertThat(i, Is.is(2));
  }


}