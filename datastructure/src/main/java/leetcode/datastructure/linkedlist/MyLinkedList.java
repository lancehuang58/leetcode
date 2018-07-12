package leetcode.datastructure.linkedlist;

import java.util.StringJoiner;

/**
 * Author:Lance Date:2018/7/12 Description:
 */
public class MyLinkedList {

  private SinglyListNode head;

  public MyLinkedList() {
  }


  public void addAtHead(int i) {
    SinglyListNode newHeadNode = new SinglyListNode(i);
    if (head == null) {
      this.head = newHeadNode;
    } else {
      newHeadNode.next = head;
      this.head = newHeadNode;
    }
  }

  public int getHeadValue() {
    return head.getVal();
  }

  public void showListContent() {
    StringJoiner joiner = new StringJoiner(",", "{", "}");
    showList(head, joiner);
    System.out.println("list content " + joiner.toString());
  }

  private void showList(SinglyListNode node, StringJoiner joiner) {
    if (node != null) {
      joiner.add(String.valueOf(node.getVal()));
      if (node.next != null) {
        showList(node.next, joiner);
      }
    }
  }

  public void addAtTail(int i) {
    if (head == null) {
      this.head = new SinglyListNode(i);
    } else {
      getLastNode(head).next = new SinglyListNode(i);
    }
  }

  public int getTailValue() {
    return getLastNode(head).getVal();
  }

  public SinglyListNode getLastNode(SinglyListNode head) {
    if (head.next != null) {
      return getLastNode(head.next);
    } else {
      return head;
    }
  }

  public void addAtIndex(int index, int value) {
  }

  public int get(int index) {
    if (index == 0) {
      return head.getVal();
    }

    SinglyListNode currentNode = head;
    int currentIndex = 0;

    while (currentNode.next != null) {
      currentNode = currentNode.next;
      currentIndex++;
      if (currentIndex == index) {
        return currentNode.getVal();
      }
    }

    return currentNode.getVal();
  }

  private class SinglyListNode {

    int val;
    private SinglyListNode next;

    public SinglyListNode(int val) {
      this.val = val;
    }

    public int getVal() {
      return val;
    }
  }
}
