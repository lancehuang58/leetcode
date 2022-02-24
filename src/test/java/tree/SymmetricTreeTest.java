package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {

  SymmetricTree processor = new SymmetricTree();

  @Test
  void isSymmetric() {
    TreeNode root = TreeUtil.treeByArray(1, 2, 2, null, 3, null, 3);
    boolean result = processor.isSymmetric(root);
    Assertions.assertThat(result).isFalse();
  }
}
