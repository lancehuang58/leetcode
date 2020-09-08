package leecode.tree;

import static org.junit.Assert.*;

import java.util.List;
import leecode.common.TreeNode;
import org.junit.Test;

public class AverageOfLevelsInBinaryTreeTest {
  AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();

  @Test
  public void case1() {
    TreeNode treeNode =
        new TreeNode(10, TreeNode.of(5), new TreeNode(15, TreeNode.of(6), TreeNode.of(20)));
//    BTreePrinter.printNode(treeNode);
    List<Double> doubles = solution.averageOfLevels(treeNode);
    System.out.println("doubles = " + doubles);
  }
}
