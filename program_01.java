// import java.util.Random;
// import java.util.random.RandomGenerator;

// import javax.naming.ldap.Rdn;

// public class program {

//     public static void main(String[] args) {
//         System.out.println("Hello world");
//     }
// }


//____________________Создание переменной___________________________

// public class program {

//     public static void main(String[] args) {
//         String s ="123333";
//         System.out.println(s);
//     }
// }

// ____________________Типы данных________________________________

// class program
// {
//   public static void main(String[] args) {
//       float e = 2.7f;
//       double pi = 3.1415;
//       short age = 10;
//       int salary = 123456;

//       System.out.println(e);        // 2.7
//       System.out.println(pi);       // 3.1415
//       System.out.println(age);      //10
//       System.out.println(salary);   //123456

//   }
// }

//_______________________Тип данных Char_________________________

// class program
// {
//   public static void main(String[] args) {
//       char ch = '1';
//       System.out.println(Character.isDigit(ch));  // true
//       ch = 'a';
//       System.out.println(Character.isDigit(ch));  // false
//   }
// }
 //___________________Тип boolean___________________________

//  public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1);  // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2);  // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3);  // false
//     }
// }

//_____________________________________________________________
// public class program {

//     public static void main(String[] args) {
//         boolean f = true ^ false;
//          System.out.println(f);
//     }
// }

// ___________________Неявная типизация_____________________________

// public class program {
//     public static void main(String[] args) {
//         var a = 789;
//         System.out.println(a);  // 789
//         var d = 456.541;
//         System.out.println(d);  // 456.541
//     }
// }

//___________________________________________________________________

// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//         System.out.println(getType(a));  // Integer
//         System.out.println(getType(d));  // Double
//         d = 1022;
//         System.out.println(d);  // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     } 
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

//_____________________Классы-обертки_________________________

// public class program
// {
//   public static void main(String[] args) {
//       System.out.println(Integer.SIZE); // 32
//       System.out.println(Integer.MIN_VALUE); // -2147483648
//   }
// }

//______________________Операции Java______________________


// public class program {

//     public static void main(String[] args) {
//         double a = 1;
//         double b = 3;
//         System.out.println(a/b); // 0 если назначить тип double, то результат будет 0,3333333333333333
//     }
// }

// ________________________Инкремент и дискремент____________________________


// public class program {
//     public static void main(String[] args) {
//         int a =225;
//         System.out.println(a++);
//         System.out.println(a);
//         System.out.println(--a);
//         System.err.println(a);
//     }
    
// }

//_____________________________Задача от интервьюера_______________________________


// public class program {
//     public static void main(String[] args) {
//         int a = 125;
//         a= --a - --a;
//         System.out.println(a);
//     }
    
// }

//______________________________Побитовые операции (побитовые сдвиги)___________________________

// public class program {

//     public static void main(String[] args) {
//         int a = 4;
//         System.out.println(a>>1);
//     }
// }

//________________________________Побитовые операции (и , или , разделительная дезъюнкция)

// public class program {

//     public static void main(String[] args) {
//         int a=5;
//         int b=2;
//         System.out.println(a^b);
//     }
// }




//_________________________________Массивы одномерные________________________________________

// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr[1]); // 2
//     }
// }
//________________________________Многомерные массивы__________________________________

// public class program {
//     public static void main(String[] args) {

//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }
// ____________________________Многомерные массивы или массивы массивов

// public class program {
//     public static void main(String[] args) {

//         int[][] arr = new int[10][5];//[строки] [колонки]
       
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
//____________________________Преобразование___________________

// public class program {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i);  // 123
//         System.out.println(d);  // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d);  // 3.1415
//         System.out.println(i);  // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d);  // 3.9415
//         System.out.println(i);  // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b);  // 123
//         b = Byte.parseByte("255");
//         System.out.println(b);  // NumberFormatException: Value out of range
//     }
//  }
 
 //____________________________Получение данных из терминала_____________________________________
// Строки_________________________________________________

// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
//    }
// }
//Примитивные типы данных_______________________________________

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
// }}

//Если не валидные данные__________________________________

// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//    } }


// ___________________________Форматированный вывод___________________________
// первый способ______________________________________________

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// второй  способ__________________________________________

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d+%d=%d\n", a,b,c);
//         System.out.println(res);
//         System.out.printf("%d+%d=%d\n",a,b,c);
//     }
// }

// ____________________________Количество знаков после запятой__________________

// public class program {
//     public static void main(String[] args) {
       
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);    // 3,141500
//         System.out.printf("%.2f\n", pi);  // 3,14
//         System.out.printf("%.3f\n", pi);  // 3,141
//         System.out.printf("%e\n", pi);    // 3,141500e+00
//         System.out.printf("%.2e\n", pi);  // 3,14e+00
//         System.out.printf("%.3e\n", pi);  // 3,141e+00
//     }
// }

//_____________________Область видимости переменных____________________

// public class program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);           
//         }     
//         //System.out.println(i);  // error: cannot find symbol
//     }
//  }

//____________________Функции и методы_________________

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }  
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}


 //___________________Управляющие конструкции_________________

 //Оператор ветвления If else________________________________

//  public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }
// можно без else__________________________________

// public class program {
//     public static void main(String[] args) {
//         int a = 19;
//         int b = 8;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;

//         System.out.println(c);
//     }
// }

//тернарный оператор____________________________________

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }
// оператор switch__________________________

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int a=123;
//         switch (a) {
//             case 1:System.out.println("aua");
                
//                 break;
//             case 2:System.out.println("bbb");
                
//                 break;
        
        
//             default:System.out.println("xxx");
//                 break;
//         }
//     }
// }
//______________ Циклы_________________________________
//While____________________________
// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

//Do while________________________________

// public class program {
//     public static void main(String[] args) {
//         int value = 42100;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

// for ____________________________

// public class program {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 5; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// Вложенные циклы_____________________________

// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
       
//     }
// }

// for in


// public class program {

//     public static void main(String[] args) {
//         int arr[] = new int[] {1,5,8,7,94,4};
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }

//_________________________Работа с файлами __________________________
//Создание запись и дозапись_________________________________________

// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } }

//Чтение посимвольно__________________________

// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     } }


// Чтение построчно_______________________________

import java.io.*;

public class program_01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}






