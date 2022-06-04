
//__________________Типы данных______________________
// public class program_03 {
//     public static void main(String[] args) {
//         Object o = 1; GetType(o);    // java.lang.Integer      
//         o = 1.2; GetType(o);         // java.lang.Double
//     }
//     static void GetType(Object obj) {
//         System.out.println(obj.getClass().getName());
//     }    
// }

//_________________________Работа с разными типами данных_______________________

// public class program_03 {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//         System.out.println(Sum("каша", "маша"));
//     }

//     // static int Sum(int a, int b) { ...
//     // }
//     // static double Sum(double a, double b) { ...
//     // }
//     // static String Sum(String a, String b) { ...
//     // }
//     static Object Sum(Object a, Object b) {

//         if (a instanceof Double && b instanceof Double) {
//             return (Object) ((Double) a + (Double) b);
//         } else if (a instanceof Integer && b instanceof Integer) {
//             return (Object) ((Integer) a + (Integer) b);
//         } else
//             return 0;

//     }

// }

// _____________________Массивы_____________________________
// Как увеличить размер массива (есть 2 элемента в массиве)

// public class program_03{
//     public static void main(String[] args) {
//         int[] a = new int[] { 1, 9 };
//         int[] b = new int[10];
//         System.arraycopy(a, 0, b, 0, a.length);
 
//         // for (int i : a) { System.out.printf("%d ", i);} // 1 9
 
//         for (int j : b) { System.out.printf("%d ", j);} 
//         // 0 9 0 0 0 0 0 0 0 0
//     } 
// }
//___________________________Массивы bla bla____________________________________

// public class program_03 {
//     static int[] AddItem(int[] array, int item) {
//         int length = array.length;
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }
//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItem(a, 2);
//         a = AddItem(a, 3);
//         for (int j : a) { System.out.printf("%d ", j); }
//     }
//  }
  //______________________________Коллекция List_________________________

  // import java.util.ArrayList;
  // import java.util.List;
  // public class program_03 {
  
  //    public static void main(String[] args) {
  //       ArrayList<Integer> list1 = new ArrayList<Integer>();
  //       // ArrayList<Integer> list2 = new ArrayList<>();
  //       // ArrayList<Integer> list3 = new ArrayList<>(10);
  //       // ArrayList<Integer> list4 = new ArrayList<>(list3);
        
        
  //        List list = new ArrayList();
  //        list.add(2809);
  //        list.add("string line");
  //        for (Object o : list) {
  //            System.out.println(o);
  //            // Проблема извлечения данных
  //        }
  //    }
  // }

// ____________________ Колекции Row Type___________________________

// import java.util.ArrayList;
// import java.util.List;
// public class program_03 {

//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2809);
//        list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }
// }

//____________________Коллекци Save Type_________________________________________

// import java.util.ArrayList;
// import java.util.List;
// public class program_03 {

//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(123);
//        // list.add("string line");
//        for (Object o : list) {
//            System.out.println(o);
//            // Проблема извлечения данных
//        }
//    }
// }
// _______________________Коллекции List функционал______________________

// import java.util.Arrays;
// import java.util.List;
// public class program_03 {
//    public static void main(String[] args) {
//        int day = 10;
//        int month = 06;
//        int year = 1982;
//        Integer[] date = { day, month, year };
//        List<Integer> d = Arrays.asList(date);
//        System.out.println(d); // [29, 9, 1990]
//    }
// }

// _________________________Коллекции функционал StringBuilder__________________________

// import java.util.Arrays;
// import java.util.List;
// public class program_03 {
//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = { day, month, year };
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d);  
        
        
//    }
// }

//_________________________Коллекции функционал StringBuilder изменение в массиве___________________

// import java.util.Arrays;
// import java.util.List;
// public class program_03 {
//    public static void main(String[] args) {
//        StringBuilder day = new StringBuilder("28");
//        StringBuilder month = new StringBuilder("9");
//        StringBuilder year = new StringBuilder("1990");
//        StringBuilder[] date = { day, month, year };
//        List<StringBuilder> d = Arrays.asList(date);
//        System.out.println(d); // [29, 9, 1990]
//        month = new StringBuilder("09");
//        date[1] = new StringBuilder("09");
//        System.out.println(d); 

//    }
// }


// ____________________________Списки_________________________

// import java.util.List;

// public class program_03 {
//    public static void main(String[] args) {
//        Character value = null;
//        List<Character> list1 = 
//            List.of('S', 'e', 'r', 'g', 'e', 'y');
//        System.out.println(list1);
//         //list1.remove(1); // java.lang.UnsupportedOperationException
//        List<Character> list2 = List.copyOf(list1);
//        System.out.println(list2);

//    }
// }

//________________Итератор______________________________

// import java.util.*;
// public class program_03 {
//    public static void main(String[] args) {
//        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

//        for (int item : list) { System.out.println(item); }
//        Iterator<Integer> col = list.iterator();

//        while (col.hasNext()) {
//            System.out.println(col.next());
//            col.next();
//            col.remove();
 
  
//        }
//    }
// }


  