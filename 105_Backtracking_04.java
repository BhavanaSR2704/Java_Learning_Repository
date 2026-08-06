
// N-Queens Problem using Backtracking

public class Backtracking_04 {

    final int N = 4;

    // Function to print the solution
    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    // Function to check whether a queen can be placed
    boolean isSafe(int board[][], int row, int col) {

        int i, j;

        // Check left side of current row
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower left diagonal
        for (i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    // Recursive function to solve N-Queens problem
    boolean solveNQUtil(int board[][], int col) {

        // If all queens are placed
        if (col >= N)
            return true;

        // Try placing queen in every row
        for (int i = 0; i < N; i++) {

            if (isSafe(board, i, col)) {

                // Place queen
                board[i][col] = 1;

                // Recur for next column
                if (solveNQUtil(board, col + 1))
                    return true;

                // Backtrack
                board[i][col] = 0;
            }
        }

        return false;
    }

    // Solves the N-Queens problem
    void solveNQ() {

        int board[][] = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        if (!solveNQUtil(board, 0)) {
            System.out.println("Solution does not exist");
            return;
        }

        printSolution(board);
    }

    // Main method
    public static void main(String[] args) {

        Backtracking_04 queen = new Backtracking_04();
        queen.solveNQ();

    }
}
