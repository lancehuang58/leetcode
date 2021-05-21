package leecode.hashtable;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

  ValidAnagram validAnagram;

  @BeforeEach
  public void setUp() {
    validAnagram = new ValidAnagram();
  }

  @Test
  public void isAnagram_car_rat_return_false_() {
    assertThat(validAnagram.isAnagram("car", "rat")).isFalse();
  }

  @Test
  public void isAnagram_car_rac_return_true_() {
    assertThat(validAnagram.isAnagram("car", "rac")).isTrue();
  }
}
