package seminar_05;

import java.util.Stack;

class MinStack {
    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
       if(stack.isEmpty()){
        stack.push(new int []{val,val});
       } else {
        int min=val < stack.peek()[1]? val: stack.peek()[1];
        stack.push(new int[]{val,min});
       }
    }
    public void pop() {
        stack.pop();

    }

    public int top() {

        return stack.peek()[0];

   
    }

    public int getMin() {
        return stack.peek()[1];
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
        minElement.push(-9);
        System.out.println(minElement.getMin());
    }
}
