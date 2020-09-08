package leecode.tree;

import static org.junit.Assert.assertThat;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class BinaryTreeTiltTest {
  BinaryTreeTilt solution = new BinaryTreeTilt();

  @Test
  public void given_null_tree_then_return_0() {
    int tilt = solution.findTilt(null);
    assertThat(tilt, Is.is(0));
  }

  @Test
  public void given_single_node_tree_then_return_1() {
    int tilt = solution.findTilt(TreeNode.of(1));
    assertThat(tilt, Is.is(0));
  }

  @Test
  public void given_multiple_node_tree_then_return_5() {
    TreeNode treeNode = new TreeNode(1, TreeNode.of(3), TreeNode.of(2));
//    BTreePrinter.printNode(treeNode);
    int tilt = solution.findTilt(treeNode);
    assertThat(tilt, Is.is(1));
  }
}
