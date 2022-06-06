import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;

import org.w3c.dom.TypeInfo;

// Задано уравнение вида q + w = e, q, w, e >= 0. 
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class seminar02_05 {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> signIndexes = new ArrayList<>();
        String text = "5? + 7?=1??";
        char[] textChar = text.replace(" ", "").toCharArray();
        char oper = '+';
       
       
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '-';
            }
            if (textChar[i] == '?') {
                signIndexes.add(i);
            }

        }
        System.out.println(Arrays.toString(textChar));
        String[] number = String.valueOf(textChar).split("-");
        
    
        
        System.out.println(Arrays.toString(number));
        System.err.println((number));
        System.out.println(signIndexes);
        int [] comb  = new int[signIndexes.size()];
        combWithRep(comb, 0, 10);


       
        

    }

    private static void gener( int[] comb, str number) {
        int a = Integer.parseInt(number[0]);
        int b = Integer.parseInt(number[1]);
        int c = Integer.parseInt(number[2]);
        while (a+b==c){
        for(int i; i< comb.length;i++){           
            if ( number[0]== "?") {
                    a=comb[i];



            }
        }
    }
    }

    public static void combWithRep(int[] comb, int index, int k) {
        if (index == comb.length) {
            return;

        }
        for (int i = 0; i < k; i++) {
            comb[index] = i;
            combWithRep(comb, index + 1, k);
        
        }
        
        System.out.println(Arrays.toString(comb));
    }
}
