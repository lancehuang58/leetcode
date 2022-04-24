package basic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FinbonacciTest {

  Fibonacci fibonacci = new Fibonacci();

  @ParameterizedTest
  @CsvSource({"0,0", "1,1", "2,1", "3, 2"})
  public void test_fib(int index, int value) {
    assertThat(fibonacci.fib(index)).isEqualTo(value);
  }
}
