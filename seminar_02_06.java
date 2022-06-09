import java.util.Arrays;

// Реализовать алгоритм сортировки слиянием
public class seminar_02_06 {
    public static void main(String[] args) {
        int[] a = { 5, 1, 6, 2, 3, 4, 9, 7 };

        gener_arr(a, a.length);

    }

    public static void gener_arr(int[] a, int n) {
        if (n < 2) {
            return;
        } else {
            int cen = n / 2;
            int[] arr1 = new int[cen];
            int[] arr2 = new int[n - cen];

            for (int i = 0; i < cen; i++) {
                arr1[i] = a[i];
            }
            for (int i = cen; i < n; i++) {
                arr2[i - cen] = a[i];
            }
            gener_arr(arr1, cen);
            gener_arr(arr2, n - cen);

            merge(a, arr1, arr2, cen, n - cen);

            System.out.println(Arrays.toString(a));
        }

    }

    public static void merge(int[] a, int[] arr1, int[] arr2, int left, int right) {

        int i = 0; int j = 0; int k = 0;
        
        while (i < left && j < right) {
            if (arr1[i] <= arr2[j]) {
                a[k] = arr1[i];
                k++;i++;
            } else {
                a[k] = arr2[j];
                k++;j++;
            }
        }
        while (i < left) {
            a[k] = arr1[i];
            k++;i++;
        }
        while (j < right) {
            a[k] = arr2[j];
            k++;j++;
        }

    }

}
