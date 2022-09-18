/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
возвращающий новый массив, каждый элемент которого равен частному элементов двух 
входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
 т.е. ваше
 */

package sem01.D_Z1;

import java.util.Arrays;

public class D_z1_04
{
    public static void main(String[] args) {

        int[] arrayA = { 10, 7, 8, 5 };
        int[] arrayB = { 2, 5, 28,1 };
        arrayDifference(arrayA, arrayB);
    }

    public static void arrayDifference(int[] arrayA, int[] arrayB) {
        int[] newArray = new int[arrayA.length];
        if (arrayA.length != arrayB.length) {
            throw new ArrayIndexOutOfBoundsException("Массивы разные по длине");
        }
       
        for (int i=0; i<arrayB.length; i++) {
        if (arrayB[i] == 0) {
            
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        }
        
        for (int i = 0; i < arrayA.length; i++) {

            newArray[i] = arrayA[i] / arrayB[i];
        }
        System.out.println(Arrays.toString(newArray));

    }
}
