package array;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  FizzBuzz.Solution game = new FizzBuzz.Solution();

  @Test
  void test_fizz() {
    List<String> result = game.fizzBuzz(3);
    Assertions.assertThat(result).containsExactly("1", "2", "Fizz");
  }

  @Test
  void test_buzz() {
    List<String> result = game.fizzBuzz(5);
    Assertions.assertThat(result).containsExactly("1", "2", "Fizz", "4", "Buzz");
  }

  @Test
  void test_fizz_buzz() {
    List<String> result = game.fizzBuzz(15);
    Assertions.assertThat(result)
        .containsExactly(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz");
  }
}
