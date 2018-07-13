package leetcode.datastructure.linkedlist;

public interface IMyLinkedList {
    void addAtHead(int i);

    void addAtTail(int i);

    int getTailValue();

    void addAtIndex(int index, int value);

    int get(int index);

    void deleteAtIndex(int index);
}

