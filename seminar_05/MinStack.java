package seminar_05;

import java.util.Stack;

class MinStack {
    Stack<Integer> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
    }

    public void pop() {
        st.pop();

    }

    public int top() {
        if (st.empty())
            return -1;

        return st.peek();
    }

    public int getMin() {
        int minEl = Integer.MAX_VALUE;
        for (int i : st) {
            if (i < minEl) {
                minEl = i;
            }
        }
        return minEl;
    }

    public static void main(String[] args) {
        MinStack minElement = new MinStack();
        minElement.push(1);
        minElement.push(2);
        minElement.push(3);
        minElement.push(4);
        minElement.getMin();
        System.out.println(minElement.getMin());

        minElement.pop();
        minElement.top();
        minElement.getMin();
        minElement.push(-4);
        System.out.println(minElement.getMin());
    }
}
