package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyLettersTest {
 ReverseOnlyLetters solution = new ReverseOnlyLetters();

    @Test
    void test() {
        String s = solution.reverseOnlyLetters("7_28");
        System.out.println("s = " + s);
    }
}