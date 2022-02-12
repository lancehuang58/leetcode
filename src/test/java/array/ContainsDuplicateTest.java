package array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ContainsDuplicateTest {
  ContainsDuplicate processor = new ContainsDuplicate();

  @Test
  void test_contains_duplicate_numbers() {
    boolean result = processor.process(new int[] {1, 2, 3, 4, 5, 1});
    Assertions.assertThat(result).isTrue();
  }
}
