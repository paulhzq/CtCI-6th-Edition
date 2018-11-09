import java.util.*;

class StackWithMin extends Stack<Integer> {
    Stack<Integer> min;
    public StackWithMin() {
        min = new Stack<Integer>();
    }

    public void push(int value) {
        if(value <= min.peek()) {
            min.push(value);
        }
        super.push(value);
    }
    public Integer pop() {
        if(super.peek() == min()) {
            min.pop();
        }
        return super.pop();
    }

    public int min() {
        if(min.isEmpty()) {
            return Integer.MAX_VALUE;
        }
        return min.peek();
    }
}