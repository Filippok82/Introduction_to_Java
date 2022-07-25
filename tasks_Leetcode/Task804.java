package tasks_Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Task804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morses = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.." };
        Set<String> uniqueMorses = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (Character c : word.toCharArray()) {
                sb.append(morses[c-'a']);
            }
            uniqueMorses.add(sb.toString());
        }
        return uniqueMorses.size();
    }

    public static void main(String[] args) {
        String[] words = { "gin","zen","gig","msg" };
        Task804 res = new Task804();
        System.out.println(res.uniqueMorseRepresentations(words));
    }
}
