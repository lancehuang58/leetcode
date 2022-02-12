package array;

/**
 * 
 */
public class ArrayReverse<T> {
    /**
     * 
     * @param array
     * @return
     */
    public T[] reverse(T[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            T t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }

        return array;
    }
}
