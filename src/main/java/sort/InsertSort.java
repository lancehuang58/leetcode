package sort;

public class InsertSort {
  /**
   * @param nums
   */
  public void sort(int[] nums) {
    Node<Integer> head = buildNode(nums);
    System.out.println(head);
    print(head);
  }

  private void print(Node<Integer> head) {
    Node c = head;
    while (c != null) {
      System.out.println(c.val + " , ");
      c = c.next;
    }
  }

  private Node<Integer> buildNode(int[] nums) {
    Node<Integer> dummy = new Node<>(-1);
    for (int i = 0; i < nums.length; i++) {
      dummy.next =  new Node<>(nums[i]);

    }
    return dummy.next;
  }

  private static class Node<T> {
    int val;
    Node<T> next;

    public Node(int val) {
      this.val = val;
    }
  }
}
