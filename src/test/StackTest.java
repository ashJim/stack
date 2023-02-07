package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import prog.Stack;

public class StackTest {
    @Test
    public void newStackShouldBeEmpty() {
        Stack<Integer> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void oneItemAddedShouldShowOnTop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        assertEquals(5, stack.peek().intValue());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void twoItemsAddedShouldShowTopItem() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.peek().intValue());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void popShouldRemoveTopItem() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.peek().intValue());
        stack.pop();
        assertEquals(5, stack.peek().intValue());
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

}
