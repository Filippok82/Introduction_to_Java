package tasks_Leetcode;

public class Task557 {
    public String reverseWords(String s) {
        StringBuilder conversely_string = new StringBuilder();
        String[] str = s.split(" ");
        for (String i : str) {
            StringBuilder temp = new StringBuilder(i);
            conversely_string.append(temp.reverse() + " ");
        }
        conversely_string.deleteCharAt(conversely_string.length() - 1);
        return conversely_string.toString();

    }
public static void main(String[] args) {
    Task557 res = new Task557();
    System.err.println(res.reverseWords("Hello Java"));
}
}
