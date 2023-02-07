package prog;

public class Stack<T> {
    private class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private StackNode<T> top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() {
        StackNode<T> oldTop = top;
        top = top.next;
        return oldTop.data;
    }

    public T peek() {
        return top.data;
    }

}