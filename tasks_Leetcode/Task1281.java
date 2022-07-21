package tasks_Leetcode;

public class Task1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0){
            sum += ( n % 10);
            product *=( n % 10);
            n /=10;
        }
    return product - sum;
    }
public static void main(String[] args) {
    Task1281 res = new Task1281();
    System.out.println(res.subtractProductAndSum(222));
}
}
