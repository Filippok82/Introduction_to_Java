package tasks_Leetcode;

import java.util.Arrays;

class Task338 {
    public int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int temp = Integer.bitCount(i);
            arr[i] = temp;
        }
        return arr;
    }
public static void main(String[] args) {
    Task338 res = new Task338();
    System.out.println(Arrays.toString(res.countBits(5)))
        ;
}
}