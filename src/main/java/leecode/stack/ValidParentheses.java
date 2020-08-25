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
//          System.out.println("input c = " + c);
          characterStack.push(c);
          break;
        case ')':
          Character pop = characterStack.pop();
//          System.out.println("pop = " + pop);
          if (pop != '(') {
            return false;
          }
          break;
        case ']':
          Character pop2 = characterStack.pop();
          System.out.println("pop2 = " + pop2);
          if (pop2 != '[') {
            return false;
          }
          break;
        case '}':
          Character pop3 = characterStack.pop();
          System.out.println("pop3 = " + pop3);
          if (pop3 != '{') {
            return false;
          }
      }
    }
    return characterStack.isEmpty();
  }
}
