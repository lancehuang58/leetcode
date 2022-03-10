package queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;;

class MyCircularQueueTest {

  @Test
  void test() {
    MyCircularQueue queue = new MyCircularQueue(3);
    assertThat(queue.enQueue(1)).isTrue();
    assertThat(queue.enQueue(2)).isTrue();
    assertThat(queue.enQueue(3)).isTrue();
    assertThat(queue.enQueue(4)).isFalse();
    assertThat(queue.Rear()).isEqualTo(3);
    assertThat(queue.isFull()).isTrue();
    assertThat(queue.deQueue()).isTrue();
    assertThat(queue.enQueue(4)).isTrue();
    assertThat(queue.Rear()).isEqualTo(4);
  }
}
