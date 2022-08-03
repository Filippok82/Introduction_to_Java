package tasks_Leetcode;

import java.util.Arrays;

public class Task561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 6, 2, 6, 5, 1, 2 };
        Task561 res = new Task561();
        System.out.println(res.arrayPairSum(nums));
    }

}
