package tasks_Leetcode;

public class Task1528 {
    public String restoreString(String s, int[] indices) {
        String[] str = new String[s.length()];
        int i = 0;
        for(int idx: indices){
            str[idx] = String.valueOf(s.charAt(i));
            i++;
        }
        return String.join("", str);
    }

public static void main(String[] args) {
    String s = "codeleet";
    int [] indices= {4,5,6,7,0,2,1,3};
    Task1528 res = new Task1528();
    System.out.println(res.restoreString(s, indices));
}
}
