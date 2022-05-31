
import java.util.Scanner;

import java.util.Arrays;

public class seminar_01_dop {
    public static void main(String[] args) {
        // differens();
        // int[] num = new int[] { 0, 2, 1, 5, 3, 4, 9 };
        // sorting1(num);
        // sorting2(num);
        // sorting3(num);
        int N = 3;
        int K = 2;
        int[] array = new int[N];
        generation_num(array, 0, K);
    }

    // Вычесть произведение и сумму цифр целого числа и расчитать разницу.

    public static void differens() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int sum = 0;
        int pow = 1;
        while (n > 0) {
            sum += n % 10;
            pow *= n % 10;
            n /= 10;

        }

        System.out.printf("\nРазница %d", pow - sum);

    }

    // Отсортитровать массив (вариант1)

    public static void sorting1(int[] num) {

        Arrays.sort(num);

        System.out.printf("\nОтсортированный масссив: %s", Arrays.toString(num));

    }

    // Сортировка пузырьком

    public static void sorting2(int[] num) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    isSorted = false;

                    temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
        }

        System.out.printf("\nСортировка пузырьком по убыванию: %s", Arrays.toString(num));
    }

    // Массив в обратном направлении
    static void sorting3(int[] num) {
        int temp;
        for (int i = num.length - 1, j = 0; i >= num.length / 2; i--, j++) {
            temp = num[j];
            num[j] = num[i];
            num[i] = temp;
        }
        System.out.printf("\nМассив наоборот: %s", Arrays.toString(num));

    }

    // Попробовать сгенерировать все перестановки длины N из K чисел с повторениями.
    // Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"

    public static void generation_num(int[] array, int index, int K) {
        if (index == array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = 0; i < K; i++) {
            array[index] = i;
            generation_num(array,index + 1, K);

        }
       
    }

}
