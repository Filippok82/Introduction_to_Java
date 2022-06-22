package seminar_05;


import java.util.Stack;

public class task03 {
    static Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push(int x) {
        st1.push(x);
       
    }

    public int pop() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.pop();
        
    }

    public int peek() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.peek(); 
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
        
    }
   
    public static void main(String[] args) {
    
       System.out.println(st1.push(1));
       System.out.println(st1.push(2));
       System.out.println(st1.pop());
       System.out.println(st1.peek());
       System.out.println(st1.empty());
    }
}