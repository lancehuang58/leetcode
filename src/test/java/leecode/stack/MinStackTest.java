package leecode.stack;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class MinStackTest {

  @Test
  public void given_normal_test_data_and_return_success() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    int min = minStack.getMin(); // return -3
    assertThat(min, Is.is(-3));
    minStack.pop();
    min = minStack.top(); // return 0
    assertThat(min, Is.is(0));
    min = minStack.getMin(); // return -2
    assertThat(min, Is.is(-2));
  }
}
