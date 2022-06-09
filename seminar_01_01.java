// 1. Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.util.Scanner;

public class seminar_01_01 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("int a:");
        double a = iScanner.nextInt();
        System.out.println("int b:");
        int b = iScanner.nextInt();
        iScanner.close();

        if(a==0||a==1){
            System.out.println(a);
        }
        if (b==0){
            System.out.println(1);
        }
        
        if (b < 0) {
            b=-b;
            a=1/a;
        }    
        double res = 1;
        for (int i = 0; i < b; i++) {
                res = res * a;
        }
        System.out.println(res);
        }
    
    }

