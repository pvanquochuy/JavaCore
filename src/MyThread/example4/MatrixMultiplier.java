package MyThread.example4;

public class MatrixMultiplier extends Thread{
    private final int[][] result;
    private final int[][] matrix1;
    private final int[][] matrix2;
    private final int rowStart;
    private final int rowEnd;

    public MatrixMultiplier(int[][] result, int[][] matrix1, int[][] matrix2, int rowStart, int rowEnd) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
    }
    public void run(){
        for(int i = rowStart; i < rowEnd; i++){
            for(int j = 0; j < matrix2[0].length; j++){
                result[i][j] = 0;
                for(int k = 0; k < matrix1[i].length; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
}
