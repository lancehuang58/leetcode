package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class PathSumTest {

  PathSum solution;

  @Before
  public void setUp(){
    solution = new PathSum();
  }

  @Test
  public void given_null_node_then_return_false() {
    boolean b = solution.hasPathSum(null, 0);
    assertFalse(b);
  }

  @Test
  public void given_single_node_then_return_true() {
    boolean a = solution.hasPathSum(TreeNode.of(1), 1);
    assertTrue(a);
  }

  @Test
  public void given_two_nodes_then_return_true() {
    TreeNode root = new TreeNode(1, TreeNode.of(2), null);
    boolean r = solution.hasPathSum(root, 3);
    assertTrue(r);
  }

  @Test
  public void given_3_nodes_then_reture_true() {
    TreeNode node2 = new TreeNode(2, TreeNode.of(3), null);
    TreeNode root = new TreeNode(1, node2, null);
    boolean r = solution.hasPathSum(root, 6);
    assertTrue(r);
  }

  @Test
  public void given_single_node_then_return_false() {
    boolean r = solution.hasPathSum(TreeNode.of(1), 10);
    assertFalse(r);
  }

}