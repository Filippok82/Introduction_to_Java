package tasks_Leetcode;

class Task709 {
    public String toLowerCase(String s) {

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            newString.append(Character.toLowerCase(s.charAt(i)));
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        Task709 res = new Task709();
        System.err.println(res.toLowerCase("REWERS"));
    }
}