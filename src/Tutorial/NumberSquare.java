package Tutorial;

public class NumberSquare {

    public static void printNumberSquare(int n) {
        if (n <= 3 || n >= 8) {
            System.out.println("Invalid input. Please provide a value for n such that 3 < n < 8.");
            return;
        }

        int[][] square = new int[n][n];
        int num = 1;

        int startRow = 0, endRow = n - 1;
        int startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int i = startCol; i <= endCol; i++) {
                square[startRow][i] = num++;
            }
            startRow++;

            // Right column
            for (int i = startRow; i <= endRow; i++) {
                square[i][endCol] = num++;
            }
            endCol--;

            // Bottom row
            for (int i = endCol; i >= startCol; i--) {
                square[endRow][i] = num++;
            }
            endRow--;

            // Left column
            for (int i = endRow; i >= startRow; i--) {
                square[i][startCol] = num++;
            }
            startCol++;
        }

        // Print the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4; // Change this to your desired value of n (where 3 < n < 8)
        printNumberSquare(n);
    }
}

