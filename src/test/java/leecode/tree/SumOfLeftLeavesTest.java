package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Test;

public class SumOfLeftLeavesTest {

  SumOfLeftLeaves solution = new SumOfLeftLeaves();

  @Test
  public void given_null_tree_then_return_0() {
    int i = solution.sumOfLeftLeaves(null);
    assertThat(i, Is.is(0));
  }

  @Test
  public void givne_multiple_node_tree_then_return_sum_of_left_leaves() {
    TreeNode treeNode =
        new ConvertSortedArrayToBST().sortedArrayToBST(new int[] {1, 2, 3, 4, 6, 5, 7, 1});
    int sumOfLeftLeaves = solution.sumOfLeftLeaves(treeNode);
    assertThat(sumOfLeftLeaves, Is.is(7));
  }
}
