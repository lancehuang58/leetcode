package leecode.tree;

import static org.junit.Assert.*;

import java.util.List;
import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class BinaryTreePathTest {
  BinaryTreePath solution = new BinaryTreePath();

  @Test
  public void given_null_tree_and_then_return_0_element_list_() {
    List<String> strings = solution.binaryTreePaths(null);
    assertTrue(strings.isEmpty());
  }

  @Test
  public void given_single_node_tree_and_then_return_1_element_list_() {
    List<String> strings = solution.binaryTreePaths(TreeNode.of(1));
    assertThat(strings.size(), Is.is(1));
  }

  @Test
  public void given_multiple_node_tree_and_then_return_2_element_list() {
    List<String> strings =
        solution.binaryTreePaths(new TreeNode(1, TreeNode.of(2), TreeNode.of(3)));
    assertThat(strings.size(), Is.is(2));
  }

  // TreeNode treeNode = solution.sortedArrayToBST(new int[] { 1, 2, 3, 4, 5 });
  @Test
  public void given_multiple_node_tree_and_then_return_5_element_list() {
    TreeNode treeNode = new ConvertSortedArrayToBST().sortedArrayToBST(new int[] {1, 2, 3, 4, 5});
    //    BTreePrinter.printNode(treeNode);
    List<String> strings = solution.binaryTreePaths(treeNode);
    assertThat(strings.get(0), Is.is("3->1->2"));
    assertThat(strings.get(1), Is.is("3->4->5"));
  }
}
