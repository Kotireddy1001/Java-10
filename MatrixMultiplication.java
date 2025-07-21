import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Enter elements for Matrix A (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = scanner.nextInt();

        System.out.println("Enter elements for Matrix B (2x2):");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                B[i][j] = scanner.nextInt();

        // Multiply A * B = C
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("\nResult Matrix C (A * B):");
        for (int[] row : C) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        scanner.close();
    }
}
