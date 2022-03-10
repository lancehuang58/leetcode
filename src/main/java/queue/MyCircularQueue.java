package queue;

public class MyCircularQueue {

  int count, size, front, rear;
  int[] data;

  public MyCircularQueue(int k) {
    count = 0;
    size = k;
    front = size -1;
    rear = 0;
    data = new int[size];
  }

  public boolean enQueue(int value) {
    if(isFull()) return false;
      
    data[rear] = value;
    rear = (rear + 1) % size;
    count++;
    return true;
  }

  public boolean deQueue() {
    if(isEmpty()) return false;

    front = (front + 1) % size;
    count--;
    return true;
  }

  public int Front() {
    return isEmpty() ? -1 : data[(front + 1) % size];
  }

  public int Rear() {
    return isEmpty() ? -1 : data[(rear - 1 + size) % size];
  }

  public boolean isEmpty() {
      return count == 0;
  }

  public boolean isFull() {
      return count == size;
  }

}
