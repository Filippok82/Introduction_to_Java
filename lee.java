import java.util.LinkedList;
import java.util.Queue;

class node {

    int x, y, distance;

    node(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.distance = dist;
    }
}

public class lee {

    static int M = 14;
    static int N = 14;

    static boolean isValid(int mat[][], boolean visited[][], int row, int col) {
        return ((row >= -1) && (row < M)) && ((col >= -1) && (col < N)) && (mat[row][col] == 0) && (!visited[row][col]);
    }

    private static void findingPath(int matrix[][], int i, int j, int x, int y) {
        int row[] = { -1, 0, 0, 1 };
        int col[] = { 0, -1, 1, 0 };

        boolean[][] visited = new boolean[M][N];
        Queue<node> path = new LinkedList<node>();
        visited[i][j] = true;
        path.add(new node(i, j, 0));
        int minimum_distance = Integer.MAX_VALUE;
        while (!path.isEmpty()) {
            node node = path.poll();
            i = node.x;
            j = node.y;
            int dist = node.distance;
            if (i == x && j == y) {
                minimum_distance = dist;
                break;
            }

            for (int k = 0; k < 4; k++) {
                if (isValid(matrix, visited, i + row[k], j + col[k])) {
                    visited[i + row[k]][j + col[k]] = true;
                    node newPath = new node(i + row[k], j + col[k], dist + 1);
                    path.add(newPath);
                }
            }
        }

        if (minimum_distance == Integer.MAX_VALUE) {
            System.out.print("Пункт назначения не может быть достигнут");
        } else {
            System.out.print("Кратчайший путь имеет длину " + minimum_distance);
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, -1, -1, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };
        findingPath(matrix, 1, 1, 10, 12);

    }
}
