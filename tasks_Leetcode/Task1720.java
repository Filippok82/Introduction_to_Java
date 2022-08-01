package tasks_Leetcode;

import java.util.Arrays;

public class Task1720 {
    public int[] decode(int[] encoded, int first) {
        int arr[] = new int[encoded.length+1];
        arr[0]  = first;
        for(int i=0; i<encoded.length; i++){
            arr[i+1] = arr[i]^encoded[i];
        }
        return arr;
    }
public static void main(String[] args) {
    int [] encoded = {1,2,3};
    int first = 1;
    Task1720 res = new Task1720();
    System.out.println(Arrays.toString(res.decode(encoded, first)));
}
}
