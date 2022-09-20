/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float)
, и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

package sem02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D_z2_1 {

    public static void main(String[] args) {
        inputOutputNumber();

    }

    public static void inputOutputNumber() {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        float num = sc.nextFloat();
        sc.close();
        System.out.println("Введено число:" + num);
    } catch (InputMismatchException e){
        System.out.println("Введите дробное число");
    }
    }
}