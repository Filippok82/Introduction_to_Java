
package seminar_05;

import java.util.Stack;
import java.util.Map;

public class task02 {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
        Stack<Character> mp = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                mp.push(s.charAt(i));
            } else {
                if (mp.isEmpty() || s.charAt(i) != map.get(mp.peek())) {
                    return false;
                }
                mp.pop();
            }
        }
        return mp.isEmpty();     
    }

}


