package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {

  BinaryTreeLevelOrderTraversal processor = new BinaryTreeLevelOrderTraversal();

  @Test
  void levelOrder() {
    TreeNode root = TreeUtil.treeByArray(3, 9, 20, null, null, 15, 7);
    TreeUtil.print(root);
    List<List<Integer>> lists = processor.levelOrder(root);
    Assertions.assertThat(lists).isNotEmpty();
  }
}
