/* 

Исправить данный код если нужно.
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

package sem02;

public class D_z2_2 {
    public static void main(String[] args) {
        
        task02(4,25);
        task02(0,14);
    }

    public static void task02(int d,int num) {
        try {
            
            double catchedRes1 = num / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
       
    }
}
