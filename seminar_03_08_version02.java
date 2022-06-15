import java.util.Arrays;

public class seminar_03_08_version02 {
    static int[][] board;
    static int[][] moves;
    static int maxMoves;

    public static void main(String[] args) {
        board = new int[5][5];
        maxMoves = board.length * board[0].length;
        moves = new int[][] { { -2, 1 }, { -2, -1 }, { 2, 1 }, { 2, -1 }, { -1, 2 }, { -1, -2 }, { 1, 2 },
                { 1, -2 } };
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (findPath(i, j, 1)) {
                    printSol();
                    return;
                }
            }
        }
        System.out.println("Решения нет");
    }

    private static boolean findPath(int cx, int cy, int moveNum) {
        board[cx][cy] = moveNum;
        if (moveNum >= maxMoves)
            return true;
        for (int i = 0; i < 8; i++) {
            int nextx = cx + moves[i][0];
            int nexty = cy + moves[i][1];
            if (isPossibleMove(nextx, nexty) && findPath(nextx, nexty, moveNum + 1)) {
                return true;
            }
        }
        board[cx][cy] = 0;
        return false;
    }

    private static boolean isPossibleMove(int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board.length && board[x][y] == 0;
    }

    static void printSol() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print( board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
