//1929. Объединение массива

package tasks_Leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

class Task1929 {

    public int[] getConcatenation(int[] nums) {
        int []num1= nums.clone();        
        int [] result = IntStream.concat(IntStream.of(nums), IntStream.of(num1)).toArray();
        return result;

    }
    
    public static void main(String[] args) {
        Task1929 res =new Task1929();
        int [] nums ={1,2,3,8,9,0};
        System.out.println(Arrays.toString( res.getConcatenation(nums)));
       

     
    }
}