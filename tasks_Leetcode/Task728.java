package tasks_Leetcode;

import java.util.ArrayList;
import java.util.List;

class Task728 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) {
                res.add(i);
            }
        }
        return res;
    }

    private boolean isDivisible(int num) {
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            if (rem == 0 || temp % rem != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
public static void main(String[] args) {
    Task728 result = new Task728();
    System.out.println(result.selfDividingNumbers(47, 85));
}
}
