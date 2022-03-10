package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

  @Test
  void test() {
    MyCircularQueue queue = new MyCircularQueue(3);
    queue.enQueue(1);
//    queue.enQueue(2);//
//    queue.enQueue(3);
//    queue.enQueue(4);
    int rear = queue.rear();
    System.out.println("rear -> "+rear);
//    queue.isFull();
//    queue.deQueue();
//    queue.enQueue(4);
//    queue.rear();
  }
}
