package tasks_Leetcode;

public class Task1859 {
    public String sortSentence(String s) {

        String[] arr = s.split(" ");
        String[] ans = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int pos = arr[i].charAt(arr[i].length() - 1) - '0';
            ans[pos - 1] = arr[i].substring(0, arr[i].length() - 1);
        }

        return String.join(" ", ans);
    }
public static void main(String[] args) {
    Task1859 res = new Task1859();
    System.out.println(res.sortSentence("is2 sentence4 This1 a3"));
}
}
