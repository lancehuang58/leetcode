package leecode.stack;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Test;

public class MovingAverageFromDataStreamTest {

  @Test
  public void next() {
    MovingAverageFromDataStream solution = new MovingAverageFromDataStream(3);
    assertThat(solution.next(1), Is.is(1.0));
    assertThat(solution.next(2), Is.is(1.5));
    assertThat(solution.next(3), Is.is(2.0));
    assertThat(solution.next(4), Is.is(3.0));
  }
}