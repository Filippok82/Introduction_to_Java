package tasks_Leetcode;

public class Task1672 {
    public int maximumWealth(int[][] accounts) {
        int bigAccount = Integer.MIN_VALUE;
        
        for (int i = 0; i < accounts.length; i++) {
           int  sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (bigAccount < sum) {
                bigAccount = sum;
            }
        }

        return bigAccount;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 1, 2, 1 } };
        Task1672 res = new Task1672();
        System.out.println(res.maximumWealth(accounts));
    }
}
