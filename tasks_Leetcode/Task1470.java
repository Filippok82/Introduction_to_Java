package tasks_Leetcode;

import java.util.Arrays;

public class Task1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[n * 2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            array[idx++] = nums[i];
            array[idx++] = nums[i + n];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        Task1470 res = new Task1470();
        System.out.println(Arrays.toString(res.shuffle(nums, n)));
    }
}
