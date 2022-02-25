package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class ConvertArrayToBSTTest {

  ConvertArrayToBST processor = new ConvertArrayToBST();

  @Test
  void test_convert_array_to_bst() {
    TreeNode node = processor.sortedArrayToBST(new int[] {1, 2, 3, 4, 5});
    Assertions.assertThat(node.val).isEqualTo(3);
    TreeUtil.print(node);
    TreeNode node2 = TreeUtil.treeByArray(1, 2, 3, 4, 5);
    TreeUtil.print(node2);
  }
}
