import java.util.*;

public class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for matrix A: ");
        int m1 = sc.nextInt(); // Rows of A
        System.out.println("Enter the number of columns for matrix A: ");
        int n1 = sc.nextInt(); // Columns of A
        System.out.println("Enter the number of rows for matrix B: ");
        int m2 = sc.nextInt(); // Rows of B
        System.out.println("Enter the number of columns for matrix B: ");
        int n2 = sc.nextInt(); // Columns of B

        // Check if multiplication is possible
        if (n1 != m2) {
            System.out.println("Multiplication not possible");
            return; // Exit if multiplication is not possible
        }

        // Initialize matrices
        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];
        int[][] C = new int[m1][n2]; // Result matrix

        // Read matrix A
        System.out.println("Read matrix A: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        // Read matrix B
        System.out.println("Read matrix B: ");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                C[i][j] = 0; // Initialize C[i][j]
                for (int k = 0; k < n1; k++) {
                    C[i][j] += A[i][k] * B[k][j]; // Correct indices for multiplication
                }
            }
        }

        // Print matrix A
        System.out.println("Matrix A is: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Print matrix B
        System.out.println("Matrix B is: ");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        // Print matrix C (Result)
        System.out.println("Matrix C (Result of A * B) is: ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
