package leecode.linkedlist;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;

public class IntersectionOfTwoLinkedLists {

  BiFunction<ListNode, ListNode, ListNode> MapStrategy =
      (nodeA, nodeB) -> {
        if (Objects.isNull(nodeA) || Objects.isNull(nodeB)) {
          return null;
        }
        Set<ListNode> sets = new HashSet<>();
        while (nodeA != null) {
          sets.add(nodeA);
          nodeA = nodeA.next;
        }
        while (nodeB != null) {
          if (sets.contains(nodeB)) {
            return nodeB;
          }
          nodeB = nodeB.next;
        }
        return null;
      };

  BiFunction<ListNode, ListNode, ListNode> TwoPointerStrategy =
      (nodeA, nodeB) -> {
        if (nodeA == null || nodeB == null) {
          return null;
        }

        ListNode aPointer = nodeA;

        ListNode bPointer = nodeB;

        while (aPointer != bPointer) {
          if (aPointer == null) {
            aPointer = nodeB;
          } else {
            aPointer = aPointer.next;
          }

          if (bPointer == null) {
            bPointer = nodeA;
          } else {
            bPointer = bPointer.next;
          }
        }
        return aPointer;
      };

  /**
   * @param nodeA fist node
   * @param nodeB second node
   * @return intersection node
   */
  public ListNode getIntersectionNode(ListNode nodeA, ListNode nodeB) {
    return TwoPointerStrategy.apply(nodeA, nodeB);
  }
}
