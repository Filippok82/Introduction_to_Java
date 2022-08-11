package tasks_Leetcode;

public class Task136 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans^=i;
        }
        return ans;
    } 
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        Task136 res = new Task136();
        System.out.println(res.singleNumber(nums));

    }
}
