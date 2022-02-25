package tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertArrayToBSTTest {

  ConvertArrayToBST processor = new ConvertArrayToBST();

  @Test
  void test_convert_array_to_bst() {
    TreeNode node = processor.sortedArrayToBST(new int[] {1, 2, 3, 4, 5});
    Assertions.assertThat(node.toArray()).containsExactly(1, 2, 3, 4, 5);
  }
}
