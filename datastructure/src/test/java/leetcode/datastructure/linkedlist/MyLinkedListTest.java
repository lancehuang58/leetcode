package leetcode.datastructure.linkedlist;

import static org.hamcrest.core.IsEqual.equalTo;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    private MyLinkedList myLinkedList;

    @Test
    public void linkedList_add_head_when_head_is_null() {
        givenContent(1);
        Assert.assertThat(myLinkedList.getHeadValue(), Is.is(equalTo(1)));
    }

    @Test
    public void linkedList_add_head_when_head_is_exist() {
        givenContent(1, 2);
        Assert.assertThat(myLinkedList.getHeadValue(), Is.is(equalTo(2)));
    }

    @Test
    public void linkedList_add_at_tail() {
        givenContent(1, 2, 3);
        myLinkedList.addAtTail(0);
//        myLinkedList.showListContent();
        Assert.assertThat(myLinkedList.getTailValue(), Is.is(equalTo(0)));
    }

    @Test
    public void linkedList_add_at_index() {
        givenContent(1, 2, 3);
        myLinkedList.addAtIndex(2, 4);
//        myLinkedList.showListContent();
        Assert.assertThat(myLinkedList.get(2), Is.is(equalTo(4)));
    }

    @Test
    public void linkedList_delete_at_index() {
        givenContent(1, 2, 3);
//        myLinkedList.showListContent();
        myLinkedList.deleteAtIndex(1);
//        myLinkedList.showListContent();
        Assert.assertThat(myLinkedList.get(1), Is.is(equalTo(1)));
    }

    @Test
    public void setMyLinkedList_get_by_index() {
        givenContent(1, 2, 3);
//        myLinkedList.showListContent();
        int val = myLinkedList.get(0);
        Assert.assertThat(val, Is.is(equalTo(3)));
    }

    @Test
    public void setMyLinkedList_get_by_index_1() {
        givenContent(1, 2, 3);
//        myLinkedList.showListContent();
        int val = myLinkedList.get(1);
        Assert.assertThat(val, Is.is(equalTo(2)));
    }

    private void givenContent(int... values) {
        myLinkedList = new MyLinkedList();
        for (int i : values) {
            myLinkedList.addAtHead(i);
        }
    }

}