package seminar_05;

import java.util.Stack;

public class task05 {

    public static String simplifyPath(String path) {
        String[] clearPath = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String item : clearPath) {
            if (item.isEmpty() || item.equals("."))
                continue;
            if (item.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(item);
            }
        }

        return "/" + String.join("/", stack);
    }

    public static void main(String[] args) {

        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/../..//c/b/"));

    }
}