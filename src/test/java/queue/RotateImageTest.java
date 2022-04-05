package queue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


class RotateImageTest {

    @Test
    void test_() {

        RotateImage rotateImage = new RotateImage();
        int[][] t = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < t.length; i++) {
            System.out.println(Arrays.toString(t[i]));
        }

        rotateImage.rotate(t);

        for (int i = 0; i < t.length; i++) {
            System.out.println(Arrays.toString(t[i]));
        }
    }
}
