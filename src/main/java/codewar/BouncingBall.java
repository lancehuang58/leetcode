package codewar;

public class BouncingBall {

  public static int bouncingBall(double h, double bounce, double window) {
    System.out.println("h = " + h + " bounce = "+ bounce + " window "+ window);

    if (h < 0 || bounce >= 1.0 || bounce < 0.0 || window >= h) {
      return -1;
    }

    int times = 1;
    double high = h * bounce;
    while (high > window) {
      times += 2;
      high = high * bounce;
    }
    return times;
  }
}
