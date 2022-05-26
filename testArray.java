import java.util.Arrays;
import java.util.Scanner;
 
public class testArray {
    static void returnReversArray(int[] arr){
        int temp;
        for (int i = arr.length-1, j = 0; i >=arr.length/2 ; i--,j++) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int sizeArr = in.nextInt();
 
        int[] arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*20-5);
        }
 
        System.out.print("Первоначальные элементы массива: ");
        for(int key : arr){ System.out.print(key+" "); }
 
 
        System.out.print("\nПереработонные элементы массива: ");
        returnReversArray(arr);
        for(int key : arr){ System.out.print(key+" "); }
 
        System.out.print("\nНу точно убеждаемся что мы инвертировали все элементы: ");
        System.out.println("\n"+Arrays.toString(arr));
    }
}