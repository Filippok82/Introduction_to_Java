package tasks_Leetcode;

public class Task1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            count += 1;
        }
        return count;
    }
public static void main(String[] args) {
    Task1342 res = new Task1342();
    System.out.println(res.numberOfSteps(12));
}
}
