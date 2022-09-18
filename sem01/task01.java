package sem01;

public class task01 {
    private static final int MIN_ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        int [] arr =  new int [3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(getArrayLength(arr));
    }

    public static int getArrayLength(int[] array) {
        if (array.length>=MIN_ARRAY_LENGTH)
        return array.length;
        return -1;

    }
}
