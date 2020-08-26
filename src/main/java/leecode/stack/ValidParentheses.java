package leecode.stack;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    char[] chars = s.toCharArray();
    Stack<Character> characterStack = new Stack<>();
    for (char c : chars) {
      switch (c) {
        case '(':
        case '[':
        case '{':
          characterStack.push(c);
          break;
        case ')':
          Character pop = characterStack.pop();
          if (pop != '(') {
            return false;
          }
          break;
        case ']':
          Character pop2 = characterStack.pop();
          if (pop2 != '[') {
            return false;
          }
          break;
        case '}':
          Character pop3 = characterStack.pop();
          if (pop3 != '{') {
            return false;
          }
      }
    }
    return characterStack.isEmpty();
  }
}
