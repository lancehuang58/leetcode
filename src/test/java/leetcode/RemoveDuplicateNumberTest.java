package leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateNumberTest {

    @Test
    public void test() {
        final int i = new RemoveDuplicateNumber().removeDuplicates(new int[]{1, 1, 2, 2, 5, 5});
        assertEquals(i, 3);
    }

    @Test
    public void test2() {
        assertEquals(new RemoveDuplicateNumber().removeDuplicates(null), 0);
        assertEquals(new RemoveDuplicateNumber().removeDuplicates(new int[]{}), 0);

    }
}