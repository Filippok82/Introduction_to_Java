
/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */

package sem01.D_Z1;

public class D_z1_01 {

    public static void main(String[] args) {
       /*  test01(); */
        /* test02(); */
        test03();
    }

    public static void test01() {

        int a = 5;
        int b = a / 0;
        System.out.println(b);

    }
    public static void test02() {

     int[] array ={1,2,3};
        System.out.println(array[4]);

    }
    public static void test03() {
        String str = "afsfsfsfsfsfs";
        int string = Integer.parseInt(str);
        System.out.println(string);
        
   
       }
   
}
