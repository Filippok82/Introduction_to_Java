package tasks_Leetcode;



public class Task344 {
    public void reverseString(char[] s) {
        char[] s1 = s.clone();

        for (int i = 0, a = s1.length - 1; i < s1.length; i++, a--) {
            s[i] = s1[a];
        }
    System.out.println(s);
    }

    public static void main(String[] args) {
        Task344 res = new Task344();
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        res.reverseString(s);

    }
}
