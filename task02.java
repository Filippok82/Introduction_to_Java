
//Учитывая два целых числа n и k, верните все возможные комбинации из k чисел из диапазона [1, n].
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;

public class task02{
    public static void main(String[] args) {

        System.out.println(combine(4, 2));
        StringBuilder word = new StringBuilder("123456789");
        StringBuilder word2 = new StringBuilder("aaaaaaa");
        mergeString(word, word2);

    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        backtracking(res, item, n, k, 1);
        return res;

    }

    private static void backtracking(List<List<Integer>> res, List<Integer> item, int n, int k, int start) {
        if (item.size() == k) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for (int i = start; i <= n; i++) {
            item.add(i);
            backtracking(res, item, n, k, i + 1);
            item.remove(item.size() - 1);

        }

    }

    // Вам даны две строки word1и word2. Объедините строки, добавляя
    // буквы в чередующемся порядке, начиная с word1. Если строка длиннее другой,
    // добавьте дополнительные буквы в конец объединенной строки.

    // Вернуть объединенную строку.

    public static void mergeString(StringBuilder word, StringBuilder word2) {
        
        StringBuilder res = new StringBuilder();
        int index = word.length() < word2.length() ? word.length() : word2.length();
        for (int i = 0; i < index; i++) {
            res.append(word.charAt(i)).append(word2.charAt(i));
        }
        if (word.length() > word2.length()) {
        res.append(word.substring(index));
        }
        else{ 
        res.append(word2.substring(index));
        }
        
        System.out.println(res.toString());

            
        }
         
    }


