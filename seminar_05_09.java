
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class seminar_05_09 {
    public static void main(String[] args) {
        
        List<Integer> arr = List.of(54,3, 7, 9, 2,99,22);
        System.out.println(sortElem(arr));

    }

    public static List<Integer> sortElem(List<Integer> arr) {
        var prioriryQuque=new PriorityQueue<Integer>();
        for(int num :arr){
            prioriryQuque.add(num);
        }
        List<Integer> sortArr = new ArrayList<>();
        while (!prioriryQuque.isEmpty()){
            sortArr.add(prioriryQuque.poll());
        }
        return sortArr;
            
        }

}