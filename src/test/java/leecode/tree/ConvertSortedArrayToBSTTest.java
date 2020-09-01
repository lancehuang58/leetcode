package leecode.tree;

import leecode.common.TreeNode;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class ConvertSortedArrayToBSTTest {

  ConvertSortedArrayToBST solution = new ConvertSortedArrayToBST();

  @Test
  public void sortedArrayToBST() {
    
    TreeNode treeNode = solution.sortedArrayToBST(new int[] { 1, 2, 3, 4, 5 });
    
    //BTreePrinter.printNode(treeNode);
    
    assertThat(treeNode.val, Is.is(3));
    
    TreeNode left = treeNode.left;
    assertThat(left.val, Is.is(1));
    assertThat(left.right.val, Is.is(2));

    
  }
}