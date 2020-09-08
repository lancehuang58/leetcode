package leecode.tree;

import static org.junit.Assert.*;

import leecode.common.TreeNode;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class ConvertBinarySearchTreeToGreaterTreeTest {

  ConvertBinarySearchTreeToGreaterTree solution = new ConvertBinarySearchTreeToGreaterTree();

  @Test
  public void sunny_case() throws Exception {
    TreeNode treeNode1 = new TreeNode(5, TreeNode.of(2), TreeNode.of(13));
    TreeNode treeNode = solution.convertBST(treeNode1);
    assertThat(treeNode.val, Is.is(18));
  }
}
