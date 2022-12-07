package tasks_Leetcode;



public class Task2413 {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;   
    }
public static void main(String[] args) {
    Task2413 res = new Task2413();
    System.out.println(res.smallestEvenMultiple(25));
}
}