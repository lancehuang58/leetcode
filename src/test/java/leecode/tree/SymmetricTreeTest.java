package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.junit.Test;

public class SymmetricTreeTest {

  SymmetricTree solution = new SymmetricTree();

  @Test
  public void given_null_tree_and_then_return_true_() {
    boolean symmetric = solution.isSymmetric(null);
    assertTrue(symmetric);
  }

  @Test
  public void given_single_node_tree_and_then_return_ture() {
    TreeNode root = TreeNode.of(1);
    boolean symmetric = solution.isSymmetric(root);
    assertTrue(symmetric);
  }

  @Test
  public void given_right_node_tree_and_then_return_false_() {
    TreeNode root = new TreeNode(0, null, TreeNode.of(1));
    boolean symmetric = solution.isSymmetric(root);
    assertFalse(symmetric);
  }

  @Test
  public void given_symmetric_tree_and_then_return_ture() {
    TreeNode leftNode = new TreeNode(2, TreeNode.of(3), TreeNode.of(4));
    TreeNode rightNode = new TreeNode(2, TreeNode.of(4), TreeNode.of(3));
    TreeNode root = new TreeNode(1, leftNode, rightNode);
    BTreePrinter.printNode(root);
    boolean symmetric = solution.isSymmetric(root);
    assertTrue(symmetric);
  }

  @Test
  public void given_unsymmetric_tree_and_return_false() {
    TreeNode leftNode = new TreeNode(2, null, TreeNode.of(3));
    TreeNode rightNode = new TreeNode(2, null, TreeNode.of(3));
    TreeNode root = new TreeNode(1, leftNode, rightNode);
    BTreePrinter.printNode(root);
    boolean symmetric = solution.isSymmetric(root);
    assertFalse(symmetric);
  }
}