import java.util.Scanner;

public class ques74 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        // Input number of coloumn
        System.out.println("Enter number of coloumn: ");
        int coloumn = sc.nextInt();

        int matrix1[][] = new int[row][coloumn];
        int matrix2[][] = new int[row][coloumn];
        int subtract[][] = new int[row][coloumn];

        // Input matrix1
        System.out.println("Input the matrix1: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        // Input matrix2
        System.out.println("Input the matrix2: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        // subtract matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                subtract[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        // Display 
        System.out.println("Subtraction of matrix is: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < coloumn; j++){
                System.out.print(subtract[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
