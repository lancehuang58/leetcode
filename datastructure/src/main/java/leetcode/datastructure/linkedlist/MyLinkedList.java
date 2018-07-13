package leetcode.datastructure.linkedlist;

public class MyLinkedList
{


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

    public void deleteAtIndex(int index) {
        SinglyListNode previousNode = getNodeByIndex(index - 1);
        SinglyListNode nextNode = getNodeByIndex(index);
        previousNode.next = nextNode.next;
        nextNode.next = null;
    }

    public void addAtIndex(int index, int value) {
        SinglyListNode node = new SinglyListNode(value);
        SinglyListNode previousNode = getNodeByIndex(index - 1);
        SinglyListNode nextNode = getNodeByIndex(index);
        previousNode.next = node;
        node.next = nextNode;
    }

    private SinglyListNode getNodeByIndex(int index) {
        if (index == 0) {
            return head;
        }

        SinglyListNode currentNode = head;
        int currentIndex = 0;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            currentIndex++;
            if (currentIndex == index) {
                return currentNode;
            }
        }
        return null;
    }


    public int get(int index) {
        return getNodeByIndex(index)!= null?getNodeByIndex(index).getVal():0;
    }


    public int getHeadValue() {
        return head.getVal();
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

