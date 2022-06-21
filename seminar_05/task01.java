package seminar_05;

import java.util.Set;
import java.util.Stack;

public class task01 {
    public int evalRPN(String[] tokens) {
        Set<String> operation = Set.of("+", "-", "*", "/");
        Stack<Integer> number = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!operation.contains(tokens[i])) {
                number.push(Integer.parseInt(tokens[i]));
            } else {
                int num2 = number.pop();
                int num1 = number.pop();
                switch (tokens[i]) {
                    case "+":
                        number.push(num1 + num2);
                        break;

                    case "-":
                        number.push(num1 - num2);
                        break;
                    case "*":
                        number.push(num1* num2);
                        break;
                    case "/":
                        number.push(num1 / num2);
                        break;

                }

            }
        }
        return number.pop();
    }

}
