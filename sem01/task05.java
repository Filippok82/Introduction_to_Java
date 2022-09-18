

package sem01;

import java.util.ArrayList;
import java.util.List;

public class task05 {

    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, null, 3, 4, null, 6};


    }


    public static void checkArray(Integer[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
