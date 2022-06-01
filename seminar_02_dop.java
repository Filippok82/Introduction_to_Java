//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение)
public class seminar_02_dop {
    public static void main(String[] args) {
        String str1 = "abccba";
        System.out.println(polindrom(str1));
        String str = "aaabbbcdd";
        System.out.println(zipper(str));
        
    }

    public static boolean polindrom(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd, результат -
    // a4b3cd2

    public static String zipper(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == sb.charAt(sb.length() - 1)) {
                count++;
            } else {
                sb.append(count == 1 ? "" : count).append(str.charAt(i));
                count = 1;
            }
        }
        sb.append(count);
        return sb.toString();

    }

}
