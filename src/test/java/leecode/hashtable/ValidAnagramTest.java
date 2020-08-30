package leecode.hashtable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidAnagramTest {

  ValidAnagram validAnagram;

  @Before
  public void setUp(){
    validAnagram = new ValidAnagram();
  }

  @Test
  public void isAnagram_car_rat_return_false_() {
    boolean r = validAnagram.isAnagram("car", "rat");
    Assert.assertFalse(r);
  }

  @Test
  public void isAnagram_car_rac_return_true_() {
    boolean r = validAnagram.isAnagram("car", "rac");
    Assert.assertTrue(r);
  }
}