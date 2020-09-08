package leecode.stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidParenthesesTest {

  ValidParentheses validParentheses = new ValidParentheses();

  @Test
  public void given_small_quotes_verify_string_is_parentheses_and_return_true() {
    boolean valid = validParentheses.isValid("()");
    assertTrue(valid);
  }

  @Test
  public void given_all_kinds_of_quotes_correctly_verify_string_is_parentheses_and_return_true() {
    boolean valid = validParentheses.isValid("()[]{}");
    assertTrue(valid);
  }
}
