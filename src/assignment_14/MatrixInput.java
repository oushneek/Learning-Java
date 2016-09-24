package assignment_14;

import java.util.Scanner;

public class MatrixInput {

    public static void main(String[] args) {

        int i, j;
        MatrixMultiply X = new MatrixMultiply();

        Scanner input = new Scanner(System.in);

        // input of matrix
        System.out.println("Enter first matrix[2,2] :");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                X.a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter second matrix[2,2] :");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                X.b[i][j] = input.nextInt();
            }
        }

        X.multiply();

                // printing the result
        System.out.println("Result");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(X.c[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
