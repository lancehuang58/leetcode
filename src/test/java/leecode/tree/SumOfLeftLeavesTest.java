package leecode.tree;

import static org.assertj.core.api.Assertions.assertThat;

import leecode.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SumOfLeftLeavesTest {

  SumOfLeftLeaves solution = new SumOfLeftLeaves();

  @Test
  public void given_null_tree_then_return_0() {
    assertThat(solution.sumOfLeftLeaves(null)).isEqualTo(0);
  }

  @Test
  public void givne_multiple_node_tree_then_return_sum_of_left_leaves() {
    TreeNode treeNode = new ConvertSortedArrayToBST().sortedArrayToBST(new int[] {1, 2, 3, 4, 6, 5, 7, 1});
    assertThat(solution.sumOfLeftLeaves(treeNode))
        .isEqualTo(7);
  }
}
