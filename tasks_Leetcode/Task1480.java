package tasks_Leetcode;

import java.util.Arrays;

class Task1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 8, 2 };
        Task1480 res = new Task1480();
        System.out.println(Arrays.toString(res.runningSum(nums)));
    }
}