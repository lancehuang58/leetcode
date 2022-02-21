package linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Merge2SortedListTest {

    Merge2SortedList processor = new Merge2SortedList();

    @Test
    void test_merge_two_list() {
        ListNode node = processor.merge(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4));
        node.print();
        Assertions.assertThat(node.values()).containsExactly(1, 1, 2, 3, 4, 4);
    }
}
