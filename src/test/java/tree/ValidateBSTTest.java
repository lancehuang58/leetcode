package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidateBSTTest {
  ValidateBST processor = new ValidateBST();

  @Test
  void test_validate_bst() {
    boolean result = processor.isValidBST(TreeUtil.treeByArray());
    Assertions.assertThat(result).isTrue();
  }

  @Test
  void test_validate_bst_2() {
    boolean result = processor.isValidBST(TreeUtil.treeByArray(2, 1, 3));
    Assertions.assertThat(result).isTrue();
  }

  @Test
  void test_validate_bst_3() {
    TreeNode treeNode = TreeUtil.treeByArray(5, 1, 4, null, null, 3, 6);
    TreeUtil.print(treeNode);
    boolean result = processor.isValidBST(treeNode);
    Assertions.assertThat(result).isFalse();
  }

  @Test
  void test_validate_bst_4() {
    TreeNode treeNode = TreeUtil.treeByArray(5, 4,6, null, null, 3, 7);
    TreeUtil.print(treeNode);
    boolean result = processor.isValidBST(treeNode);
    Assertions.assertThat(result).isFalse();
  }
}
