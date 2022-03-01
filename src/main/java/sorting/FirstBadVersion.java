package sorting;

public class FirstBadVersion {

  public int firstBadVersion(int n) {

    int front = 0, end = n, mid;
    while (end > front) {
      mid = front + (end - front) / 2;
      if (isBadVersion(mid)) {
        end = mid;
      } else {
        front = mid + 1;
      }
    }
    return end;
  }

  private boolean isBadVersion(int mid) {
    return false;
  }
}
