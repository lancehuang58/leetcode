package leecode.stack;

public class MinStack {

  private class LstNode {

    public LstNode next;
    public LstNode min;
    public int val;

    public LstNode(int val) {
      this.val = val;
    }
  }

  LstNode head;

  public MinStack() {}

  public void push(int x) {
    LstNode temp = new LstNode(x);
    if (head == null) {
      head = temp;
      head.min = temp;
    } else {
      temp.next = head;
      temp.min = (temp.val < temp.next.min.val) ? temp : temp.next.min;
      head = temp;
    }
  }

  public void pop() {
    if (head != null) {
      head = head.next;
    }
  }

  public int top() {
    if (head != null) {
      return head.val;
    } else {
      throw new RuntimeException("data not exist");
    }
  }

  public int getMin() {
    return head.min.val;
  }
}
