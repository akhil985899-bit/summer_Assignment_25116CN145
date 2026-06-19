 import java.util.Scanner;

public class ques75 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        // Input number of coloumn
        System.out.println("Enter number of coloumn: ");
        int coloumn = sc.nextInt();

        int matrix[][] = new int[row][coloumn];
        int transpose[][] = new int[coloumn][row];

        // Input matrix
        System.out.println("Input the matrix1: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // Print original matrix is: 
        System.out.println("Original matrix");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }
        // Transpose matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        // Display 
        System.out.println("transpose matrix is: ");
        for(int i = 0; i < coloumn; i++){
            for(int j = 0; j < row; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


