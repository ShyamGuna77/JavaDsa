public class SudokuSolver {
    public static boolean solveSudoku(int[][] grid) {
        // Find an empty cell (marked with 0)
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        if (isEmpty) {
            // Puzzle is solved
            return true;
        }

        for (int num = 1; num <= 9; num++) {
            if (isValidMove(grid, row, col, num)) {
                grid[row][col] = num;
                if (solveSudoku(grid)) {
                    return true;
                }
                grid[row][col] = 0; // Backtrack
            }
        }

        return false; // No valid number for this cell
    }

    public static boolean isValidMove(int[][] grid, int row, int col, int num) {
        // Check if num is not present in current row, column, or subgrid
        return !isInRow(grid, row, num) && !isInCol(grid, col, num) && !isInSubgrid(grid, row - row % 3, col - col % 3, num);
    }

    public static boolean isInRow(int[][] grid, int row, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInCol(int[][] grid, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInSubgrid(int[][] grid, int startRow, int startCol, int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printSudoku(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(sudoku)) {
            System.out.println("Sudoku solved:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
