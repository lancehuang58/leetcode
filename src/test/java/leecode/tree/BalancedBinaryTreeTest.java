package leecode.tree;

import static org.junit.Assert.assertTrue;

import leecode.common.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class BalancedBinaryTreeTest {

  BalancedBinaryTree solution;

  @Before
  public void setUp() throws Exception {
    solution = new BalancedBinaryTree();
  }



  @Test
  public void given_root_without_sub_node_then_return_true() {
    // 3,9,20,null,null,15,7
    TreeNode node20 = new TreeNode(20, TreeNode.of(15), TreeNode.of(7));
    TreeNode root = new TreeNode(3, TreeNode.of(9), node20);
    boolean isBalance = solution.isBalanced(root);
    assertTrue(isBalance);
  }
}
