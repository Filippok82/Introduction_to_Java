package tasks_Leetcode;

class Task461 {
    public int hammingDistance(int x, int y) {
        int res = x ^ y;
        int count = 0;
        while (res != 0) {
            int rsb = res & -res;
            res -= rsb;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        Task461 result = new Task461();
        System.out.println(result.hammingDistance(1, 4));
    }
}
