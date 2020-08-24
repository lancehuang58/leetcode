package leecode.stack;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;

public class StackByQueueTest {

    StackByQueue.MyStack stack;

    @Before
    public void init() {
        stack = new StackByQueue.MyStack();
    }


    
    @Test
    public void given_normal_case(){
        stack.push(1);
        stack.push(2);
        
        int r1 = stack.top();
        assertThat(r1, Is.is(2));
        int r2 = stack.pop();
        assertThat(r2, Is.is(2));

        boolean isEmpty = stack.empty();
        assertFalse(isEmpty);
    }


}