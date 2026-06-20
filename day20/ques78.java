 import java.util.Scanner;

public class ques78 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of square matrix
        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();

        // Declare matrix
        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Assume the matrix is symmetric
        boolean isSymmetric = true;

        // Check whether matrix is symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Compare element with its transpose position
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break; // Exit inner loop
                }
            }

            // Exit outer loop if matrix is not symmetric
            if (!isSymmetric) {
                break;
            }
        }

        // Display result
        if (isSymmetric) {
            System.out.println("Matrix is Symmetric.");
        } else {
            System.out.println("Matrix is Not Symmetric.");
        }

        sc.close();
    }
}

