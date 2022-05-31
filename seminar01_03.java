// Написать программу вычисления n-ого треугольного числа. url

public class seminar01_03 {
    public static void main(String[] args) {
        num_trig(6);
    }

    public static void num_trig(int n) {
        int t;
        if ((8 * n + 1)%1== 0) // проверка является ли n квадратным числом
        {
            t = n * (n + 1) / 2;
            System.out.println(t);
        } 
        else {
            System.out.println("что-то пошло не так");
        }

    }

}
