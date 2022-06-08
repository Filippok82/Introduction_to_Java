public class seminar_03_07 {
    public static void main(String[] args) {
        int[][] board = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };
        if (!solveQueen(board, 0)) {
            System.out.println("Решения нет");
            return;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.err.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkPosition(int board[][], int row, int colum) {
        for (int i = 0; i < colum; i++) {
            if (board[row][i] == 1)
                return false;
        }
        for (int i = row - 1, j = colum - 1; i >= 0 && j >= 0; i--, j--) {

        }
        for (int i = row + 1, j = colum - 1; i < board.length && j >= 0; i++, j--) {

        }
        return true;
    }

 public static boolean solveQueen(int board[][], int col) {
    if(col>=board.length){
        return true;
    }
    for(int i=0;i<board.length;i++){
        if(checkPosition(board, i, col)){
            board[i][col]=1;
            if(solveQueen(board, col+1)){
                return true;
            }
        board[i][col]=0;
        }
    }
 return false;
}
}
