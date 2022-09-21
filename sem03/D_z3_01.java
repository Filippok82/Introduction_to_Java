/* 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. 
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или 
 текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, 
 в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException 
и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали 
на вход корректный массив).
 */
package sem03;

public class D_z3_01 {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, 
                                        {"1", "2", "3", "4"}, 
                                        {"1", "2", "3", "4"}, 
                                        {"1", "2", "3", "4","5"}};
        try {
            try {
                System.out.println(convertingTwoArray(arr));
            } catch (MyArraySizeException e) {
                System.out.println("Неправильный размер массива!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("В массиве содержаться не числа! Ошибка в ячейке: " + e.i + "x" + e.j);
        } 

    }



    public static int convertingTwoArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }
}