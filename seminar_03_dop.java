import java.util.Arrays;
import java.util.*;
// Учитывая целочисленный массив arr фиксированной длины, 
//дублируйте каждое вхождение нуля, сдвигая остальные элементы вправо.

public class seminar_03_dop {

    // public static void main(String[] args) {
    // int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };

    // duplicateZeros(arr);

    // }

    // public static void duplicateZeros(int[] arr) {
    // int n = arr.length;
    // int count = 0;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == 0)
    // count = count + 1;
    // }

    // int loc = n - 1;
    // int p = n - 1 + count;
    // if (count == 0)
    // System.out.println(Arrays.toString(arr));
    // for (int i = n - 1, j = p; i >= 0; i--, j--) {
    // if (j <= n && loc >= 0) {
    // if (arr[i] == 0) {
    // arr[loc] = 0;
    // arr[loc - 1] = 0;
    // loc = loc - 2;
    // } else {
    // arr[loc] = arr[i];
    // loc = loc - 1;
    // }
    // }
    // }
    // System.out.println(Arrays.toString(arr));
    // }

    // _____________________________________________________

    // public static void duplicateZeros(int[] arr) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == 0) {
    // System.arraycopy(arr, i, arr, i + 1, n - i - 1);
    // ++i;
    // }
    // }
    // }

    // public static void main(String[] args) {
    // int[] a = { 1, 0, 2, 3, 0, 4, 5, 0 };
    // duplicateZeros(a);
    // System.out.println(Arrays.toString(a));
    // }
    // }

    // Дан массив целых чисел arr, возврат true тогда и только тогда, когда это
    // допустимый массив гор .
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,2,1,0};
        System.out.println(validMountainArray(arr));

    }

    // public static boolean validMountainArray(int[] arr) {
    // int cen = arr.length / 2;
    // for (int i = 0, j=cen; i < arr.length/2 && j < arr.length; i++, j++) {
    // if (arr[i] < arr[i + 1] && arr[j]>arr[j+1]) {
    // return true;
    // }

    // }
    // return false;

    public static boolean validMountainArray(int[] arr) {
        int i = 0;
       int j = arr.length - 1;
       int n = arr.length - 1;
       while (i + 1 < n && arr[i] < arr[i+1]) {
           i++;
       }

       while (j > 0 && arr[j] < arr[j-1]) {
           j--;
       }

       return (i > 0 && i == j && j < n);
   }

}