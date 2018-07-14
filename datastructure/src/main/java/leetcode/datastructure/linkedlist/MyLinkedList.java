package leetcode.datastructure.linkedlist;


import java.util.StringJoiner;

public class MyLinkedList {

  private SinglyListNode head;

  public int get(int index) {
    SinglyListNode current = head;
    int currentIndex = 0;
    while (current != null) {
      if (index == currentIndex) {
        return current.val;
      }
      current = current.next;
      currentIndex++;
    }
    return -1;
  }

  public SinglyListNode getNode(int index) {

    if (index == 0) {
      return head;
    }

    SinglyListNode current = head;
    int currentIndex = 0;
    while (current != null) {
      if (index == currentIndex) {
        return current;
      }
      current = current.next;
      currentIndex++;
    }
    return null;
  }

  public void addAtHead(int val) {
    if (this.head == null) {
      this.head = new SinglyListNode(val);
    } else {
      SinglyListNode newHead = new SinglyListNode(val);
      newHead.next = head;
      this.head = newHead;
    }
  }

  public void addAtTail(int val) {
    if (this.head == null) {
      this.head = new SinglyListNode(val);
    } else {
      SinglyListNode current = getLastNode();
      current.next = new SinglyListNode(val);
    }
  }

  public int getLostNodeVal() {
    return getLastNode().val;
  }

  public SinglyListNode getLastNode() {
    SinglyListNode current = head;

    while (current.next != null) {
      current = current.next;
    }

    return current;
  }

  public void addAtIndex(int index, int val) {
    if (index == 0) {
      addAtHead(val);
    } else {
      SinglyListNode previous = getNode(index - 1);
      if (previous == null) {
        return;
      }
      SinglyListNode current = getNode(index);
      SinglyListNode newNode = new SinglyListNode(val);
      previous.next = newNode;
      newNode.next = current;
    }
  }

  public void deleteAtIndex(int index) {
    if (index == 0) {
      if (head != null) {
        head = head.next;
      }
    } else {
      SinglyListNode previous = getNode(index - 1);
      SinglyListNode next = getNode(index + 1);
      previous.next = next;
    }

  }

  @Override
  public String toString() {
    SinglyListNode current = head;
    int currentIndex = 0;
    StringJoiner stringJoiner =
        new StringJoiner(",", "{", "}");
    while (current != null) {
      stringJoiner.add(currentIndex + "=" + current.val);
      current = current.next;
      currentIndex++;
    }
    return stringJoiner.toString();
  }

  private class SinglyListNode {

    int val;
    private SinglyListNode next;

    public SinglyListNode(int val) {
      this.val = val;
    }

     int getVal() {
      return val;
    }

  }
}



