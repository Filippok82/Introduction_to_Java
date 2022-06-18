 import java.util.*;
 public class program_04 {
   
//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        System.out.println(queue); // [1, 2, 3, 4]
//        int item = queue.remove();
//        System.out.println(queue); // [2, 3, 4]
//        queue.offer(2809);
//        item = queue.remove();
//        System.out.println(queue); // [3, 4, 2809]
//        item = queue.remove();
//        System.out.println(queue); // [4, 2809]
//        item = queue.poll();
//        System.out.println(queue); // [2809]
       
//    }
//_________________________________________________________
// public static void main(String[] args) {
//     Queue<Integer> queue = new LinkedList<Integer>();
//     queue.add(1);
//     int item = queue.remove();
//     queue.offer(2809);
//     item = queue.poll();
//     System.out.println(queue);

//     queue.remove(2809); // зачем очередь??

//     queue.element();
//     queue.peek();

//     System.out.println(queue);

//_______________Deque___________________________________

// public static void main(String[] args) {
//     Deque<Integer> deque = new ArrayDeque<>();
//     // Deque<Integer> deque = new ArrayDeque<>();
//     deque.addFirst(1);   deque.addLast(2);
//     System.out.println(deque);
//     deque.removeLast();  deque.removeLast();
//     System.out.println(deque);
//     deque.offerFirst(1); deque.offerLast(2);
//     System.out.println(deque);
//     deque.pollFirst();   deque.pollLast();
//     System.out.println(deque);
//     deque.getFirst();    deque.getLast();
//     System.out.println(deque);
//     // deque.peekFirst();   deque.peekLast();
//     // System.out.println(deque);
// }

//__________________________STACK________________________________________

public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(12);
    stack.push(123);
    System.out.println(stack.pop()); // 123
    System.out.println(stack.pop()); // 12
    System.out.println(stack.pop()); // 1
}


}







