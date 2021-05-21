package leecode.tree;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;

import leecode.common.TreeNode;
import leecode.tree.medium.PathSum3;
import org.junit.jupiter.api.Test;

public class PathSum3Test {

  PathSum3 solution = new PathSum3();

  @Test
  public void given_null_tree_and_then_return_0() {
    int i = solution.pathSum(null, 8);
    assertThat(i, is(0));
  }

  @Test
  public void given_simple_tree_and_then_return_1() {
    int i = solution.pathSum(TreeNode.of(10), 10);
    assertThat(i, is(1));
  }

  @Test
  public void given_simple_tree_and_then_return_2() {
    TreeNode treeNode =
        new ConvertSortedArrayToBST().sortedArrayToBST(new int[] {1, 2, 3, 4, 6, 5, 7, 1});
    int i = solution.pathSum(treeNode, 9);
    assertThat(i, is(2));
  }
}
