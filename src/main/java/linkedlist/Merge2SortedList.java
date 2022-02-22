package linkedlist;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

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

  BinaryOperator<ListNode> iteratorFunction =
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

  public ListNode merge(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;
    if (l2 == null) return l1;

    if (l1.val < l2.val) {
      l1.next = merge(l1.next, l2);
      return l1;
    } else {
      l2.next = merge(l2.next, l1);
      return l2;
    }
  }
}
