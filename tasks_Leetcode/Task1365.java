package tasks_Leetcode;

import java.util.Arrays;



public class Task1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
public static void main(String[] args) {
    int[] nums = {8,1,2,2,3};
    Task1365 result = new Task1365();
    System.out.println(Arrays.toString(result.smallerNumbersThanCurrent(nums)));
}
}
