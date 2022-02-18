package array;

public class RemoveDuplicateNumbers {

    public int execute(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int front = 0, rear = 1;
        while (rear != numbers.length - 1) {
            if (numbers[front] != numbers[rear]) {
                numbers[front] = numbers[rear];
                front++;
            }
            rear++;
        }
        return front;
    }
}
