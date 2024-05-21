package MyThread.example4;

public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] result = new int[matrix1.length][matrix2[0].length];
        int numThreads = 3; // Number of threads to use

        MatrixMultiplier[] multipliers = new MatrixMultiplier[numThreads];
        int rowsPerThread = matrix1.length / numThreads;
        int startRow = 0;
        int endRow = rowsPerThread;

        for (int i = 0; i < numThreads; i++) {
            multipliers[i] = new MatrixMultiplier(result, matrix1, matrix2, startRow, endRow);
            startRow = endRow;
            endRow = (i == numThreads - 2) ? matrix1.length : endRow + rowsPerThread;
            multipliers[i].start();
        }

        for (MatrixMultiplier multiplier : multipliers) {
            try {
                multiplier.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print result matrix
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
