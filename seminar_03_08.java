//Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

import java.util.concurrent.ThreadLocalRandom;

public class seminar_03_08 {
    static int N = 8;

    // Шаблон перемещения на основе изменений
    // координат x и y
    static int[] cx = { 1, 1, 2, 2, -1, -1, -2, -2 };
    static int[] cy = { 2, -2, 1, -1, 2, -2, 1, -1 };

    
    // функция ограничивает пребывание коня в пределах
    // шахматной доски
    public static boolean border(int x, int y) {
        return ((x >= 0 && y >= 0) &&
                (x < N && y < N));
    }

    /*
     * Проверяет, является ли квадрат допустимым и
     * пустым или нет
     */
    public static boolean empty(int a[], int x, int y) {
        return (border(x, y)) && (a[y * N + x] < 0);
    }

    /*
     * Возвращает количество пустых квадратов
     * рядом с (x, y)
     */
    public static int getDegree(int a[], int x, int y) {
        int count = 0;
        for (int i = 0; i < N; ++i)
            if (empty(a, (x + cx[i]),
                    (y + cy[i])))
                count++;

        return count;
    }

    // Выбор следующей точки.
    // Возвращает значение false, если невозможно выбрать

    public static Cell nextMove(int a[], Cell cell) {
        int min_deg_idx = -1, c,
                min_deg = (N + 1), nx, ny;

        // Попробуйте всех N смежных (*x, *y), начиная
        // из случайного соседнего. Найдите соседний
        // с минимальной степенью.
        int start = ThreadLocalRandom.current().nextInt(1000) % N;
        for (int count = 0; count < N; ++count) {
            int i = (start + count) % N;
            nx = cell.x + cx[i];
            ny = cell.y + cy[i];
            if ((empty(a, nx, ny)) &&
                    (c = getDegree(a, nx, ny)) < min_deg) {
                min_deg_idx = i;
                min_deg = c;
            }
        }

        // Если не нашли следующий шаг
        if (min_deg_idx == -1)
            return null;

        // Сохранение координат следующей точки
        nx = cell.x + cx[min_deg_idx];
        ny = cell.y + cy[min_deg_idx];

        // Отметка следующего хода
        a[ny * N + nx] = a[(cell.y) * N +
                (cell.x)] + 1;

        // Обновления следующего хода
        cell.x = nx;
        cell.y = ny;

        return cell;
    }

    /* отображает шахматную доску со всеми ходами коня */
    public static void print(int a[]) {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j)
            System.out.printf("%d ", a[j * N + i]);
            System.out.printf(" ");
        }
    
    }

    /* Проверка соседних квадратов */
    /*
     * Если конь заканчивается на клетке, которая находится на один
     * ход коня от начальной клетки, ход сделан
     */
    static boolean neighbour(int x, int y, int xx, int yy) {
        for (int i = 0; i < N; ++i)
            if (((x + cx[i]) == xx) && ((y + cy[i]) == yy))
                return true;

        return false;
    }

    /* Генерация ходов, если нет хода возвращает false */
    public static boolean findClosedTour() {
        // Заполнение матрицы шахматной доски с помощью -1"s
        int a[] = new int[N * N];
        for (int i = 0; i < N * N; ++i)
            a[i] = -1;

        // исходное положение
        int sx = 0;
        int sy = 0;

        // Текущие точки совпадают с начальными точками
        Cell cell = new Cell(sx, sy);

        a[cell.y * N + cell.x] = 1; // Метка первого хода

        // Подбор следующей точки
        Cell ret = null;
        for (int i = 0; i < N * N - 1; ++i) {
            ret = nextMove(a, cell);
            if (ret == null)
                return false;
        }

        // Проверка, сделан ли ход(может закончиться
        // в начальной точке)
        if (!neighbour(ret.x, ret.y, sx, sy))
            return false;

        print(a);

        return true;
    }

    public static void main(String[] args) {
        new seminar_03_08();
        // Пока мы не получим решения
        while (!seminar_03_08.findClosedTour()) {

        }
    }
}

class Cell {
    int x;
    int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
