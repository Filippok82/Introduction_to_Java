package sem01;

public class task02 {
    
        private static final int MIN_ARRAY_LENGTH;
    
        static {
            MIN_ARRAY_LENGTH = 5;
        }
    
        public static void main(String[] args) {
            int[] c = test();
            int[] a = new int[] {1, 2, 3, 4, 5, 6, 7};
            int[] b = new int[] {1, 2, 3};
            System.out.println(checkArray(a, 4));
            System.out.println(checkArray(a, 9));
            System.out.println(checkArray(b, 4));
            System.out.println(checkArray(c, 0));
    
        }
    
        public static int checkArray(int[] arr, int item) {
            if (arr == null) { return -3;}
            if (arr.length < MIN_ARRAY_LENGTH) { return -1;}
            for (int i = 0; i <arr.length; i++) {
                if(item == arr[i]) {
                    return i;
                }
            }
            return -2;
        }
    
        public static int[] test() {
            return null;
        }
    }
    
