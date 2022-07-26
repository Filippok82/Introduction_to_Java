package tasks_Leetcode;

import java.util.Arrays;

class Task1313{
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
                
        int[] result = new int[size];
        
        for (int i = 1, k = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i - 1]; j++) {
                result[k++] = nums[i];
            }
        }
        
        return result;
    }
public static void main(String[] args) {
    int [] nums = {1,2,3,4};
    Task1313 res = new Task1313();
    System.out.println(Arrays.toString(res.decompressRLElist(nums)));
}
}
