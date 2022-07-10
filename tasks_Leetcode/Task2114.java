package tasks_Leetcode;

public class Task2114 {
    public int mostWordsFound(String[] sentences) {
        int max_word = 0;
        for (String st : sentences) {
            String[] arr = st.split(" ");
            if (max_word < arr.length) {
                max_word = arr.length;
            }
        }
        return max_word;
    }
public static void main(String[] args) {
    Task2114 res = new Task2114();
    String [] sentencen = {"dds dsa","asd fds eww","java java java python"};
    System.out.println(res.mostWordsFound(sentencen));
}
}
