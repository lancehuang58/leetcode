package codewar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BouncingBallTest {

  @Test
  public void test1() {
    assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
  }

  @Test
  public void test2() {
    assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
  }

  @Test
  public void test3() {
    assertEquals(-1, BouncingBall.bouncingBall(30.0, 1.0, 10));
  }
}