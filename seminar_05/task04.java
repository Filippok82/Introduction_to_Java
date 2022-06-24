
//Создайте стек, который поддерживает push, pop, top и извлечение минимального элемента за постоянное время.
package seminar_05;

import java.util.Stack;

public class task04 {
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> minEl = new Stack<>();

    public void push(int val) {
        st.push(val);
        if (minEl.isEmpty() || val <= minEl.peek()) {
            minEl.push(val);
        } else
            minEl.push(minEl.peek());
    }

    public void pop() {
        int value = st.pop();
        if (st.isEmpty() || value == minEl.peek()) {
            minEl.pop();
        }
    }

    public int top() {
        return st.isEmpty() ? -1 : st.peek();
    }

    public int getMin() {
        return minEl.isEmpty() ? -1 : minEl.peek();
    }

    public static void main(String[] args) {
        task04 minElement = new task04();
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
