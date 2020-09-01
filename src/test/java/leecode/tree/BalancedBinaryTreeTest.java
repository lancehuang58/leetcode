package leecode.tree;

import static org.junit.Assert.assertFalse;
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

    TreeNode root = new TreeNode(3, TreeNode.of(9),
        new TreeNode(20, TreeNode.of(15), TreeNode.of(7)));
//    BTreePrinter.printNode(root);
    boolean isBalance = solution.isBalanced(root);
    assertTrue(isBalance);
  }

  @Test
  public void given_node_with_unbalanced_tree_then_return_false() {
    TreeNode root =
        new TreeNode(1,
            new TreeNode(2,
                new TreeNode(3, TreeNode.of(4), TreeNode.of(4)),
                TreeNode.of(3)),
            TreeNode.of(2));
//    BTreePrinter.printNode(root);
    boolean isBalance = solution.isBalanced(root);
    assertFalse(isBalance);
  }

  //[1,null,2,null,3]
  @Test
  public void given_node_with_only_right_child() {
    TreeNode root = new TreeNode(1, null, new TreeNode(2, null, TreeNode.of(3)));
//    BTreePrinter.printNode(root);
    boolean isBalance = solution.isBalanced(root);
    assertFalse(isBalance);
  }

}
