package tasks_Leetcode;

import java.util.Arrays;

public class Task832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length, m = image[0].length;
        for (int i = 0; i < n; i++) {
            int start = 0, end = m - 1;
            while (start <= end) {
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                if (start == end)
                    image[i][start] ^= 1;
                else {
                    image[i][start] ^= 1;
                    image[i][end] ^= 1;
                }
                start++;
                end--;
            }
        }
        return image;

    }

    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        Task832 res = new Task832();
        System.out.println(Arrays.deepToString(res.flipAndInvertImage(image)));
    }
}
