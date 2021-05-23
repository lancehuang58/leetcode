package leecode.arraylist;

import jdk.nashorn.internal.runtime.logging.Logger;
import org.junit.jupiter.api.Test;

import static leecode.arraylist.FindDuplicateNumber.find;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateNumberTest {

  @Test
  void test_find_with_zero_array_throw_runtime_exception() {
    assertThrows(
        RuntimeException.class,
        () -> {
          final int i = find(new int[] {});
        });
  }

  @Test
  void test_find_duplicate_no() {
    int r = find(new int[] {2, 3, 1, 0, 2, 5});
    assertThat(r).isEqualTo(2);
  }

  @Test
  void test_find_duplicate_no_no_duplicate() {
    int r = find(new int[] {1, 2, 3, 4, 0});
    assertThat(r).isEqualTo(-1);
  }
}
