package tree;

import org.junit.jupiter.api.Test;

class MaxDepthOfTreeTest {

  @Test
  void test_build_tree() {
    final TreeNode root = TreeNode.of(1, 2, 3, 4, 5, 6, 7,8,9,10);
    root.print();
  }
}