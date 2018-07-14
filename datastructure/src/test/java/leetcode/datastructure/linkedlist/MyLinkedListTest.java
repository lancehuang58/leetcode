package leetcode.datastructure.linkedlist;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {

  private MyLinkedList myLinkedList;


  @Before
  public void init() {
    myLinkedList = new MyLinkedList();
  }

  @Test
  public void get_invalidate_index() {
    int r = myLinkedList.get(0);
    assertThat(r, is(equalTo(-1)));
  }

  @Test
  public void add_tail() {
    myLinkedList = new MyLinkedList();
    myLinkedList.addAtTail(1);
    myLinkedList.addAtTail(2);

    myLinkedList.addAtTail(3);
    myLinkedList.addAtTail(4);

    assertThat(myLinkedList.get(1), is(equalTo(2)));
    assertThat(myLinkedList.getLostNodeVal(), is(equalTo(4)));
  }

  @Test
  public void add_head() {
    myLinkedList = new MyLinkedList();
    myLinkedList.addAtTail(1);
    myLinkedList.addAtTail(2);
    myLinkedList.addAtHead(6784);
    assertThat(myLinkedList.get(0), is(equalTo(6784)));
  }

  @Test
  public void delete_at_index() {
    myLinkedList = new MyLinkedList();
    myLinkedList.addAtTail(1);
    myLinkedList.addAtTail(2);
    myLinkedList.addAtHead(6784);
    System.out.println(myLinkedList.toString());
    myLinkedList.deleteAtIndex(0);
    System.out.println(myLinkedList.toString());
    assertThat(myLinkedList.get(0), is(equalTo(1)));
    myLinkedList.deleteAtIndex(0);
    myLinkedList.deleteAtIndex(0);
    myLinkedList.deleteAtIndex(0);

  }


  @Test
  public void add_with_index() {
    myLinkedList = new MyLinkedList();
    myLinkedList.addAtTail(1);
    myLinkedList.addAtTail(2);
    myLinkedList.addAtTail(3);
    myLinkedList.addAtTail(4);
    myLinkedList.addAtIndex(1,10);
    System.out.println(myLinkedList.toString());
  }

  /**
   * ["MyLinkedList"  ,"get"  ,"addAtIndex" ,"get","get","addAtIndex","get","get"]
     [[]              ,[0]    ,[1,2]        ,[0]  ,[1],[0,1],[0],[1]]
   */

  @Test
  public void add_with_index2() {
    myLinkedList = new MyLinkedList();
    myLinkedList.get(0);
    myLinkedList.addAtIndex(1,2);
    myLinkedList.get(0);
    myLinkedList.get(1);
    myLinkedList.addAtIndex(0,1);
    myLinkedList.get(0);
    myLinkedList.get(1);
    System.out.println(myLinkedList.toString());
  }

  /*@Test
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
    myLinkedList.showListContent();
    Assert.assertThat(myLinkedList.getTailValue(), Is.is(equalTo(0)));
  }

  *//*@Test
  public void linkedList_add_at_index() {
    givenContent(1, 2, 3);
    //myLinkedList.addAtIndex(3, 4);
    myLinkedList.showListContent();
    myLinkedList.addAtIndex(0, 1);
    //Assert.assertThat(myLinkedList.getTailValue(), Is.is(equalTo(4)));
  }*//*

  @Test
  public void setMyLinkedList_get_by_index() {
    givenContent(1, 2, 3);
    myLinkedList.showListContent();
    int val =  myLinkedList.get(0);
    Assert.assertThat(val, Is.is(equalTo(3)));
  }

  @Test
  public void setMyLinkedList_get_by_index_1() {
    givenContent(1, 2, 3);
    myLinkedList.showListContent();
    int val =  myLinkedList.get(1);
    Assert.assertThat(val, Is.is(equalTo(2)));
  }*/


}