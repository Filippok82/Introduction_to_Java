import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class seminar_06_10 {
  static Map<String, Integer> map = new HashMap<>();
  static Set<String> operations = new HashSet<>();

  static {
    map.put("+", 1);
    map.put("-", 1);
    map.put("/", 2);
    map.put("*", 2);
    map.put("(", 0);

    operations.add("+");
    operations.add("-");
    operations.add("*");
    operations.add("/");
  }

  public String postfixFrom(String infixExp) {
    StringBuilder result = new StringBuilder();
    Stack<String> stack = new Stack<>();

    String[] tokens = infixExp.split(" ");
    for (String token : tokens) {
      if (token.equals("(")) {
        stack.push(token);
      } else if (token.equals(")")) {
        String removedToken = stack.pop();
        while (!removedToken.equals("(")) {
          result.append(removedToken).append(" ");
          removedToken = stack.pop();
        }

      } else if (!operations.contains((token))) {
        result.append(token).append(" ");

      } else {
        while (!stack.isEmpty() && map.get(stack.peek()) >= map.get(token)) {
        }
        stack.push(token);
      }
    }
    while (!stack.isEmpty()) {
      result.append(stack.pop()).append(" ");
    }

    return result.toString().trim();
  }

  public int evalRPN(String[] tokens) {
    if (tokens.length == 1) {
      return Integer.parseInt(tokens[0]);
    }
    int result = 0;
    Stack<Integer> nums = new Stack<>();
    Set<String> operations = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
    for (String token : tokens) {
      if (operations.contains(token)) {
        int num2 = nums.pop();
        int num1 = nums.pop();

        nums.add(perform(token, num1, num2));
        result = nums.peek();
      } else {
        nums.add(Integer.parseInt(token));
      }
    }
    return result;
  }

  int perform(String operations, int num1, int num2) {
    switch (operations) {
      case "+":
        return num1 + num2;
      case "-":
        return num1 - num2;
      case "*":
        return num1 * num2;
      case "/":
        return num1 / num2;

      default:
        throw new RuntimeException();
    }
  }

  public static void main(String[] args) {
    seminar_06_10 solution = new seminar_06_10();
    String res = solution.postfixFrom("2 + 5 - 33 * 7");
    System.out.println(res);
    System.out.println(solution.evalRPN(res.split(" ")));
  }
}
