package tasks_Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2160 {
    public int minimumSum(int num) {
        List<Integer> number = new ArrayList<>();
        int cloneNum = num;
        for(int i=0; i< 4; i++){            
            int digit = cloneNum % 10;
            cloneNum = cloneNum / 10;            
            number.add(digit);
        }
        Collections.sort(number);
        String first = String.valueOf(number.get(0));
        first = first + number.get(2);
        String second = String.valueOf(number.get(1));
        second = second + number.get(3);
        
        return Integer.parseInt(first) + Integer.parseInt(second);
    }
public static void main(String[] args) {
    Task2160 res = new Task2160();
    System.out.println(res.minimumSum(3214));
}
}
