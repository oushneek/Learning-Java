package assignment_14;

public class MatrixMultiply {

    int i, j, k;
    int[][] a = new int[2][2];
    int[][] b = new int[2][2];
    int[][] c = new int[2][2];

    public void multiply() {
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

    }
}
