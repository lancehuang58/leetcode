package array;

import org.junit.jupiter.api.Test;

class NumArraySumTest {
    @Test
    void test() {

        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int i = numArray.sumRange(0, 2);
        System.out.println("i = " + i);
        int j = numArray.sumRange(2, 5);
        System.out.println("j = " + j);
        int k = numArray.sumRange(0, 5);
        System.out.println("k = " + k);
    }
}