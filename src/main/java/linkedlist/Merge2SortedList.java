package linkedlist;

import java.util.Objects;
import java.util.function.BiFunction;

public class Merge2SortedList {

  BiFunction<ListNode, ListNode, ListNode> recursiveFunction =
      ((list1, list2) -> {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
          list1.next = merge(list1.next, list2);
          return list1;
        } else {
          list2.next = merge(list1, list2.next);
          return list2;
        }
      });

  BiFunction<ListNode, ListNode, ListNode> iteratorFunction =
      (list1, list2) -> {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (Objects.nonNull(list1) && Objects.nonNull(list2)) {
          if (list1.val <= list2.val) {
            head.next = list1;
            list1 = list1.next;
          } else {
            head.next = list2;
            list2 = list2.next;
          }
          head = head.next;
        }

        if (Objects.isNull(list1)) {
          head.next = list2;
        }

        if (Objects.isNull(list2)) {
          head.next = list1;
        }

        return dummy.next;
      };

  public ListNode merge(ListNode list1, ListNode list2) {
    return iteratorFunction.apply(list1, list2);
  }
}
