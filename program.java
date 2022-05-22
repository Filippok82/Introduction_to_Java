
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

//______________________



