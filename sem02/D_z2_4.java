
/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку
. Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

package sem02;

import java.util.Scanner;

public class D_z2_4 {

       
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку");
            String text = in.nextLine();
            in.close();
            
            if(text.isEmpty())
                throw new IllegalArgumentException("Строка пустая!");
            else
                System.out.println(text);
        }
    
    }


