package tasks_Leetcode;

public class Task2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String string : operations) {
            if (string.equals("X++")) {
                x++;
            }
            if (string.equals("X--")) {
                x--;
            }
            if (string.equals("--X")) {
                --x;
            }
            if(string.equals("++X")){
                ++x;
            }
        }
        return x;

    }

public static void main(String[] args) {
    String[] operations={"--X","X++","X++"};
    Task2011 res = new Task2011();
    System.err.println(res.finalValueAfterOperations(operations));
}
}
