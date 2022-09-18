/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов 
в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. */

package sem01.D_Z1;

import java.util.Arrays;

public class D_z1_03 {
    public static void main(String[] args) {

        int[] arrayA = { 10, 7, 8, 8 };
        int[] arrayB = { 2, 5, 28,1 };
        arrayDifference(arrayA, arrayB);
    }

    public static void arrayDifference(int[] arrayA, int[] arrayB) {

        int[] newArray = new int[arrayA.length];

        if (arrayA.length == arrayB.length) {
            for (int i = 0; i < arrayA.length; i++) {
                newArray[i] = arrayA[i] - arrayB[i];
            }
            System.out.println(Arrays.toString(newArray));
        }

        else System.out.println("Массивы разные по длине");
    }

}