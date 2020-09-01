package leecode.tree;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeLevelOrderTraversalTest {

  BinaryTreeLevelOrderTraversal solution;

  @Before
  public void setup() {
    solution = new BinaryTreeLevelOrderTraversal();
  }

  /**
   * <pre> [3,9,20,null,null,15,7],
   *       3
   *      / \
   *     9  20
   *       /  \
   *      15   7
   * </pre>
   * [ [15,7], [9,20], [3] ]
   */
  @Test
  public void given_tree_node_and_test_order() {
    TreeNode node20 = new TreeNode(20, TreeNode.of(15), TreeNode.of(7));
    TreeNode root = new TreeNode(3, TreeNode.of(9), node20);
//    BTreePrinter.printNode(root);
    List<List<Integer>> r = solution.levelOrderBottom(root);
//    System.out.println("r = " + r);
    assertThat(r.get(0), Is.is(Arrays.asList(15, 7)));
    assertThat(r.get(1), Is.is(Arrays.asList(9, 20)));
    assertThat(r.get(2), Is.is(Arrays.asList(3)));
  }


  /**
   * [1,2,3,4,null,null,5]
   * <pre>
   *       1
   *      / \
   *     2   3
   *    /     \
   *   4      5
   * </pre>
   */
  @Test
  public void given_tree_node_and_test_order2() {
    TreeNode node2 = new TreeNode(2, TreeNode.of(4), null);
    TreeNode node3 = new TreeNode(3, null, TreeNode.of(5));

    TreeNode root = new TreeNode(1, node2, node3);
//    BTreePrinter.printNode(root);
    List<List<Integer>> r = solution.levelOrderBottom(root);
//    System.out.println("r = " + r);
    assertThat(r.get(0), Is.is(Arrays.asList(4,5)));
    assertThat(r.get(1), Is.is(Arrays.asList(2,3)));
    assertThat(r.get(2), Is.is(Arrays.asList(1)));
  }
}
