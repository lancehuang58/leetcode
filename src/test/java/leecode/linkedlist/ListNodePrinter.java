package leecode.linkedlist;

import java.util.StringJoiner;

public class ListNodePrinter {


  public static String toArrayString(ListNode node) {

    StringJoiner joiner = new StringJoiner(",", "[", "]");
    joiner.add(String.valueOf(node.val));
    while (node.next != null) {
      joiner.add(String.valueOf(node.next.val));
       node = node.next;
    }
    return joiner.toString();
  }

  public void prettyPrintLinkedList(ListNode node) {

    while (node != null && node.next != null) {
      System.out.print(node.val + "->");
      node = node.next;
    }

    if (node != null) {
      System.out.println(node.val);
    } else {
      System.out.println("Empty LinkedList");
    }
  }
}
