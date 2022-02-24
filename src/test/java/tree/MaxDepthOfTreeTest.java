package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxDepthOfTreeTest {
  MaxDepthOfTree processor = new MaxDepthOfTree();

  @Test
  void test_find_max_depth_from_tree() {
    TreeNode root = TreeUtil.treeByArray(3, 9, 20, null, null, 15, 7);
    TreeUtil.print(root);
    int r = processor.maxDepth(root);
    Assertions.assertThat(r).isEqualTo(3);
  }
}